package com.bingo.code.example.design.visitor.rewrite;

/**
 * ���ֿͻ��ĸ���
 */
public abstract class Customer {
    /**
     * �ͻ����
     */
    private String customerId;
    /**
     * �ͻ�����
     */
    private String name;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * ���ܷ����ߵķ���
     *
     * @param visitor �����߶���
     */
    public abstract void accept(Visitor visitor);
}
