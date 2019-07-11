package com.credit.service;

import com.credit.vo.PropertiesVo;

import java.util.List;

public interface CreditReportService {

    List<PropertiesVo> getCreditReportNoResult(String companyId, String type);
}
