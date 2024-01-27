package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Accounts, Long> {

    // findBy needs to be same so JPA can detect it and do its thing. CustomerId also need to match the field from the customer bean. In this case it is (customerId)
    Optional<Accounts> findByCustomerId(Long customerId);
}
