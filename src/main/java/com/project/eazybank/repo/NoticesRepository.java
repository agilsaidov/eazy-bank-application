package com.project.eazybank.repo;

import com.project.eazybank.model.Notices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticesRepository extends CrudRepository<Notices, Long> {

    @Query("SELECT n FROM Notices n WHERE CURRENT_DATE BETWEEN n.noticBegDt AND n.noticEndDt")
    List<Notices> findAllActiveNotices();
}
