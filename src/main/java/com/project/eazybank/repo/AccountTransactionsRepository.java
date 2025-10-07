package com.project.eazybank.repo;

import com.project.eazybank.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
    AccountTransactions findByCustomerIdOrderByTransactionDtDesc(long accountId);
}
