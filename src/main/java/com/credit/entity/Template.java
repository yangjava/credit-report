package com.credit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="template")
public class Template {
    @Id
    private Long tid;

    private String type;

    private String name;

    private String version;

    private String status;

}
