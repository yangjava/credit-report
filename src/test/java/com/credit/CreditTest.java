package com.credit;

import com.credit.dao.PropertiesRepository;
import com.credit.dao.PvalueRepository;
import com.credit.dao.TemplateRepository;
import com.credit.entity.Properties;
import com.credit.entity.Pvalue;
import com.credit.entity.Template;
import com.credit.service.CreditReportService;
import com.credit.vo.PropertiesVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditTest {

     @Autowired
     private TemplateRepository templateRepository;
     @Autowired
     private PropertiesRepository propertiesRepository;
     @Autowired
     private PvalueRepository pvalueRepository;

     @Autowired
     private CreditReportService creditReportService;


     @Test
     public void templateTest(){
         Optional<Template> byId = templateRepository.findById(1L);
         System.out.println(byId.get());
     }

    @Test
    public void propertiesTest(){
        Optional<Properties> byId = propertiesRepository.findById(1L);
        System.out.println(byId.get());
    }

    @Test
    public void pvalueTest(){
        Optional<Pvalue> byId = pvalueRepository.findById(1L);
        System.out.println(byId.get());
    }

    @Test
    public void pvalueListTest(){
        List<Pvalue> pvalues = pvalueRepository.findByPidAndTidAndCompanyId(1L,1L,0L);
        System.out.println(pvalues);
    }

    @Test
    public void getCreditReportNoResult(){
        List<PropertiesVo> creditReportNoResult = creditReportService.getCreditReportNoResult("", "");
        System.out.println(creditReportNoResult);
    }







}
