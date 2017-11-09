package com.bingo.code.example.design.visitor.rewrite;

/**
 * ���˿ͻ�
 */
public class PersonalCustomer extends Customer {
    /**
     * ��ϵ�绰
     */
    private String telephone;
    /**
     * ����
     */
    private int age;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void accept(Visitor visitor) {
        //�ص������߶������Ӧ����
        visitor.visitPersonalCustomer(this);
    }
}