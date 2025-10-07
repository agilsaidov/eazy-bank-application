package com.project.eazybank.repo;

import com.project.eazybank.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(long accountId);
}
