package com.credit.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pvalue")
public class Pvalue {
    private Long vid;

    private Long pid;

    private String name;

    private String tid;

    private String companyId;
}
