package com.example.demo.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
    private String rollNo;
    private String fName;
    private String lName;
    private String age;

    public StudentDto(String rollNo, String fName, String lName, String age) {
        this.rollNo = rollNo;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}




