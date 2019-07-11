package com.credit.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="properties")
public class Properties {

    private Long pid;

    private Long tid;

    private Long parentPid;

    private Long parentVid;

    private String status;

    private String sortOrder;
}
