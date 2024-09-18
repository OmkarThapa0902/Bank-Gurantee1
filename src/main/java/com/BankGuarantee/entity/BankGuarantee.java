package com.BankGuarantee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class BankGuarantee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guaranteeNumber;
    private String beneficiaryName;
    private String beneficiaryAddress;
    private String applicantName;
    private String applicantAddress;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String guaranteeAmount;
    private String guaranteeStatus;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;
    }

    public String getGuaranteeNumber() {
    	return guaranteeNumber; 
    }
    public void setGuaranteeNumber(String guaranteeNumber) {
    	this.guaranteeNumber = guaranteeNumber; 
    	}

    public String getBeneficiaryName() { 
    	return beneficiaryName; 
    }
    public void setBeneficiaryName(String beneficiaryName) {
    	this.beneficiaryName = beneficiaryName; 
    	}

    public String getBeneficiaryAddress() { 
    	return beneficiaryAddress;
    }
    public void setBeneficiaryAddress(String beneficiaryAddress) {
    	this.beneficiaryAddress = beneficiaryAddress; 
    	}

    public String getApplicantName() { return applicantName;
    }
    public void setApplicantName(String applicantName) { 
    	this.applicantName = applicantName;
    	}

    public String getApplicantAddress() { return applicantAddress;
    }
    public void setApplicantAddress(String applicantAddress) {
    	this.applicantAddress = applicantAddress;
    	}

    public LocalDate getIssueDate() { return issueDate; 
    }
    public void setIssueDate(LocalDate issueDate) {
    	this.issueDate = issueDate;
    	}

    public LocalDate getExpiryDate() { return expiryDate; 
    }
    public void setExpiryDate(LocalDate expiryDate) {
    	this.expiryDate = expiryDate; }

    public String getGuaranteeAmount() { return guaranteeAmount; 
    }
    public void setGuaranteeAmount(String guaranteeAmount) { 
    	this.guaranteeAmount = guaranteeAmount;
    	}

    public String getGuaranteeStatus() {
    	return guaranteeStatus;
    }
    public void setGuaranteeStatus(String guaranteeStatus) { 
    	this.guaranteeStatus = guaranteeStatus; 
    	}
}

