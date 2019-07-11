package com.credit.service.impl;

import com.credit.dao.PropertiesRepository;
import com.credit.dao.PvalueRepository;
import com.credit.dao.TemplateRepository;
import com.credit.entity.Properties;
import com.credit.entity.Template;
import com.credit.service.CreditReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditReportServiceImpl implements CreditReportService {

    @Autowired
    private PropertiesRepository propertiesRepository;
    @Autowired
    private PvalueRepository pvalueRepository;
    @Autowired
    private TemplateRepository templateRepository;


    public void getCreditReportNoResult(String companyId,String type){

    }


}
