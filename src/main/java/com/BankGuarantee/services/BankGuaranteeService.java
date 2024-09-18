package com.BankGuarantee.services;

import java.util.List;

import com.BankGuarantee.entity.BankGuarantee;

public interface BankGuaranteeService {
    void save(BankGuarantee bankGuarantee);
    List<BankGuarantee> getAll();
    BankGuarantee getById(Long id);
}
