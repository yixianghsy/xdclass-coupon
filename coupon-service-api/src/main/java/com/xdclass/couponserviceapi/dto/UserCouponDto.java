package com.xdclass.couponserviceapi.dto;


import java.io.Serializable;

public class UserCouponDto implements Serializable {


    private Integer couponId;

    private Integer userId;

    private Integer orderId;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
