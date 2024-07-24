package com.proretention.scrm.Integration.filter;

public class Person {

    private String name;

    private  String gender;

    private   String martialStatus;

    public Person(String name, String gender, String martialStatus) {
        this.name = name;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }
}
