package com.credit.service.impl;

import com.credit.dao.PropertiesRepository;
import com.credit.dao.PvalueRepository;
import com.credit.dao.TemplateRepository;
import com.credit.entity.Properties;
import com.credit.entity.Pvalue;
import com.credit.entity.Template;
import com.credit.service.CreditReportService;
import com.credit.vo.PropertiesVo;
import com.credit.vo.PvalueVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditReportServiceImpl implements CreditReportService {

    @Autowired
    private PropertiesRepository propertiesRepository;
    @Autowired
    private PvalueRepository pvalueRepository;
    @Autowired
    private TemplateRepository templateRepository;

    @Override
    public List<PropertiesVo> getCreditReportNoResult(String companyId,String type){
        List<PropertiesVo> list = getLevel(0L, 0L, 1L, 0L);
        list.stream().forEach(
                level1->{
                    List<PvalueVo> pvalueVoList = level1.getPvalueVoList();
                    List<PvalueVo> getpvalue = getpvalue(pvalueVoList);
                    level1.setPvalueVoList(getpvalue);
                }
        );
        return list;
    }


    public List<PropertiesVo> getPropertiesVo(PropertiesVo propertiesVo,Long companyId){
        List<PropertiesVo> propertiesVoList=new ArrayList<>();
        List<Properties> propertiesList = propertiesRepository
                .findByParentPidAndParentVidAndTid
                        (propertiesVo.getPid(), propertiesVo.getParentPid(), propertiesVo.getTid());
        propertiesList.stream().forEach(properties -> {
            PropertiesVo propertiesVo1=new PropertiesVo();
            BeanUtils.copyProperties(properties,propertiesVo1);
            List<Pvalue> pvalues = pvalueRepository.findByPidAndTidAndCompanyId(properties.getPid(), properties.getTid(), companyId);
            List<PvalueVo> pvalueVos=new ArrayList<>();
            pvalues.stream().forEach(pvalue ->{
                PvalueVo pvalueVo=new PvalueVo();
                BeanUtils.copyProperties(pvalue,pvalueVo);
                pvalueVos.add(pvalueVo);
            });
            propertiesVo1.setPvalueVoList(pvalueVos);
            propertiesVoList.add(propertiesVo1);
        });
        return propertiesVoList;
    }


    public List<PvalueVo> getpvalue(List<PvalueVo> pvalueVos){
        pvalueVos.stream().forEach(pvalueVo -> {
            List<PropertiesVo> level = getLevel(pvalueVo.getPid(), pvalueVo.getVid(), pvalueVo.getTid(), pvalueVo.getCompanyId());
            pvalueVo.setPropertiesVoList(level);
        });
        return pvalueVos;
    }


    public List<PropertiesVo> getLevel(Long pid,Long vid,Long tid,Long companyId){
        List<PropertiesVo> propertiesVoList=new ArrayList<>();
        List<Properties> propertiesList = propertiesRepository
                .findByParentPidAndParentVidAndTid
                        (pid, vid, tid);
        propertiesList.stream().forEach(properties -> {
            PropertiesVo propertiesVo1=new PropertiesVo();
            BeanUtils.copyProperties(properties,propertiesVo1);
            List<Pvalue> pvalues = pvalueRepository.findByPidAndTidAndCompanyId(properties.getPid(), properties.getTid(), companyId);
            List<PvalueVo> pvalueVos=new ArrayList<>();
            pvalues.stream().forEach(pvalue ->{
                PvalueVo pvalueVo=new PvalueVo();
                BeanUtils.copyProperties(pvalue,pvalueVo);
                pvalueVos.add(pvalueVo);
            });
            propertiesVo1.setPvalueVoList(pvalueVos);
            propertiesVoList.add(propertiesVo1);
        });
        return propertiesVoList;

    }
}
