package com.credit.dao;

import com.credit.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties,Long> {

    List<Properties> findByPidAndParentPidAndParentVidAndTid(Long pid,Long parentPid,Long parentVid,Long tid);

    List<Properties> findByParentPidAndTid(Long parentPid,Long tid);
}
