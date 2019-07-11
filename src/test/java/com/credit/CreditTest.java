package com.credit;

import com.credit.dao.PropertiesRepository;
import com.credit.dao.PvalueRepository;
import com.credit.dao.TemplateRepository;
import com.credit.entity.Properties;
import com.credit.entity.Pvalue;
import com.credit.entity.Template;
import com.credit.vo.PropertiesVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
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
    public void getCreditReportNoResult(String companyId,String type){
        List<PropertiesVo> propertiesVoList=new ArrayList<>();
        Optional<Template> templateOptional = templateRepository.findById(1L);
        if(templateOptional.isPresent()){
            List<Properties> propertiesList1 = propertiesRepository.findByParentPidAndTid(0L, templateOptional.get().getTid());
            propertiesList1.stream().forEach(
              properties -> {
                  PropertiesVo propertiesVo=new PropertiesVo();
                  BeanUtils.copyProperties(properties,propertiesVo);
              }
            );

        }

    }






}
