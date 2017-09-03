package com.google.ssm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 *
 */
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private Integer orderId;

    private Integer workAreaId;

    private Integer status;

    private Integer isPass;

    private Date cutOffTime;

    private Date createTime;

    private Date updateTime;

    private Integer isDel;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getWorkAreaId() {
        return this.workAreaId;
    }

    public void setWorkAreaId(Integer workAreaId) {
        this.workAreaId = workAreaId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsPass() {
        return this.isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Date getCutOffTime() {
        return this.cutOffTime;
    }

    public void setCutOffTime(Date cutOffTime) {
        this.cutOffTime = cutOffTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public OrderDetail(Integer id, Integer userId, Integer orderId, Integer workAreaId, Integer status, Integer isPass, Date cutOffTime, Date createTime, Date updateTime, Integer isDel) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.workAreaId = workAreaId;
        this.status = status;
        this.isPass = isPass;
        this.cutOffTime = cutOffTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDel = isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public OrderDetail() {
    }
}
