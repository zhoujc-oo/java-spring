package com.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -339516038496531943L;
    private String sno;
    private String name;
    private String sex;
    private String phone;
    private String address;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSon(){ return phone;}

    public void setPhone(String phone){this.phone = phone;}

    public String getAddress(){return address;}

    public void setAddress(String address){this.address = address;}
}