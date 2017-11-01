package com.bingo.code.example.design.builder.prototype.nodesign;

public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum = 0;

    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String toString() {
        return "???????????????????=" + this.enterpriseName + "???????????=" + this.productId + "???????????=" + this.orderProductNum;
    }
}
