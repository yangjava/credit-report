package com.credit.utils;

import com.credit.vo.PropertiesVo;
import com.credit.vo.PvalueVo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReportBuild {


    public  static void build(List<PropertiesVo> propertiesList, List<PvalueVo> pvalueVoList){
        List<PropertiesVo> propertiesVoList=new ArrayList<>();
        propertiesVoList=propertiesList.stream().filter(propertiesVo ->
                propertiesVo.getParentPid().equals(0L)&&propertiesVo.getParentVid().equals(0L))
          .collect(Collectors.toList());






    }
}
