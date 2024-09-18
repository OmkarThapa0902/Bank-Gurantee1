package com.BankGuarantee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.BankGuarantee.entity.BankGuarantee;
import com.BankGuarantee.services.BankGuaranteeService;

import java.time.LocalDate;
import java.util.List;

/*@Controller
public class BankGuaranteeController {

    @Autowired
    private BankGuaranteeService bankGuaranteeService;

    @GetMapping("/bankGuarantees")
    public String getAllGuarantees(Model model) {
        List<BankGuarantee> guarantees = bankGuaranteeService.getAll();
        model.addAttribute("guarantees", guarantees);
        return "bankGuarantees";  // View displaying all bank guarantees
    }

  /*  @PostMapping("/createBankGuarantee")
    public String createGuarantee(@ModelAttribute BankGuarantee bankGuarantee) {
        // Ensure the form data is being received and processed
        bankGuarantee.setGuaranteeStatus("active");
        bankGuarantee.setIssueDate(LocalDate.now());
        bankGuaranteeService.save(bankGuarantee);  // Save the bank guarantee
        return "redirect:/bankGuarantees";  // Redirect to view all bank guarantees
    }//
    @PostMapping("/createBankGuarantee")
    public String createGuarantee(@ModelAttribute BankGuarantee bankGuarantee) {
        // Handle the form data here
        bankGuarantee.setGuaranteeStatus("active");
        bankGuarantee.setIssueDate(LocalDate.now());
        bankGuaranteeService.save(bankGuarantee);  // Save the bank guarantee
        return "redirect:/bankGuarantees";  // Redirect after successful creation
    }

}*/

@Controller
public class BankGuaranteeController {

    @Autowired
    private BankGuaranteeService bankGuaranteeService;

    @GetMapping("/bankGuarantees")
    public String getAllGuarantees(Model model) {
        List<BankGuarantee> guarantees = bankGuaranteeService.getAll();
        model.addAttribute("guarantees", guarantees);
        return "bankGuarantees";  // View displaying all bank guarantees
    }

    @GetMapping("/createBankGuarantee")
    public String createGuarantee(@ModelAttribute BankGuarantee bankGuarantee) {
    	  System.out.println("Form data received: " + bankGuarantee);
        bankGuarantee.setGuaranteeStatus("active");
        bankGuarantee.setIssueDate(LocalDate.now());
        bankGuaranteeService.save(bankGuarantee);  
        return "redirect:/bankGuarantees";  
    }
}

