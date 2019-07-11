package com.credit.dao;

import com.credit.entity.Pvalue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PvalueRepository extends JpaRepository<Pvalue,Long> {

    List<Pvalue> findByPidAndTidAndCompanyId(Long pid, Long tid,Long companyId);
}
