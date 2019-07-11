package com.credit.dao;

import com.credit.entity.Pvalue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PvalueRepository extends JpaRepository<Pvalue,Long> {
}
