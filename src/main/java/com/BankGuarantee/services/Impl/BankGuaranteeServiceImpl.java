package com.BankGuarantee.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankGuarantee.entity.BankGuarantee;
import com.BankGuarantee.repository.BankGuaranteeRepository;
import com.BankGuarantee.services.BankGuaranteeService;

@Service
public class BankGuaranteeServiceImpl implements BankGuaranteeService {

    @Autowired
    private BankGuaranteeRepository bankGuaranteeRepo;

    @Override
    public void save(BankGuarantee bankGuarantee) {
        bankGuaranteeRepo.save(bankGuarantee);  // Save the bank guarantee to the database
    }

    @Override
    public List<BankGuarantee> getAll() {
        return bankGuaranteeRepo.findAll();  // Fetch all bank guarantees from the database
    }

    @Override
    public BankGuarantee getById(Long id) {
        return bankGuaranteeRepo.findById(id).orElse(null);  // Fetch a specific bank guarantee by ID
    }
}
