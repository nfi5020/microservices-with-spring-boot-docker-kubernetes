package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // findBy needs to be same so JPA can detect it and do its thing. MobileNumber also need to match the field from the account bean. In this case its (mobileNumber)
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
