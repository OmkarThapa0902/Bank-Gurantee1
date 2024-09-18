package com.BankGuarantee.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.BankGuarantee.entity.BankGuarantee;

public interface BankGuaranteeRepository extends JpaRepository<BankGuarantee, Long> {
}

