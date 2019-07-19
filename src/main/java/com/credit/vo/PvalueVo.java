package com.credit.vo;

import java.util.List;


public class PvalueVo {

    private Long vid;

    private Long pid;

    private String name;

    private Long tid;

    private Long companyId;

    private List<PropertiesVo> propertiesVoList;

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<PropertiesVo> getPropertiesVoList() {
        return propertiesVoList;
    }

    public void setPropertiesVoList(List<PropertiesVo> propertiesVoList) {
        this.propertiesVoList = propertiesVoList;
    }

    @Override
    public String toString() {
        return "PvalueVo{" +
                "vid=" + vid +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", tid='" + tid + '\'' +
                ", companyId='" + companyId + '\'' +
                ", propertiesVoList=" + propertiesVoList +
                '}';
    }
}
