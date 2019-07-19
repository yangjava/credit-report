package com.credit.vo;

import java.util.List;


public class PropertiesVo {
    private Long pid;

    private Long tid;

    private Long parentPid;

    private Long parentVid;

    private String name;

    private String status;

    private String sortOrder;

    private List<PvalueVo> pvalueVoList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getParentPid() {
        return parentPid;
    }

    public void setParentPid(Long parentPid) {
        this.parentPid = parentPid;
    }

    public Long getParentVid() {
        return parentVid;
    }

    public void setParentVid(Long parentVid) {
        this.parentVid = parentVid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<PvalueVo> getPvalueVoList() {
        return pvalueVoList;
    }

    public void setPvalueVoList(List<PvalueVo> pvalueVoList) {
        this.pvalueVoList = pvalueVoList;
    }

    @Override
    public String toString() {
        return "PropertiesVo{" +
                "pid=" + pid +
                ", tid=" + tid +
                ", parentPid=" + parentPid +
                ", parentVid=" + parentVid +
                ", status='" + status + '\'' +
                ", sortOrder='" + sortOrder + '\'' +
                ", pvalueVoList=" + pvalueVoList +
                '}';
    }
}
