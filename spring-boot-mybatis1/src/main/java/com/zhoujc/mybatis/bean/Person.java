package com.zhoujc.mybatis.bean;

public class Person {
    private int ID;
    private String name;
    private int age;
    public Person(int id,String name,int age){
        this.ID = id;
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
