package com.project.eazybank.repo;

import com.project.eazybank.model.Contacts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contacts, String> {}
