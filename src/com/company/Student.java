package com.company;

public class Student {
    String EnrolID;
    String FullName;
    Integer age;

    public Student(String enrolID, String fullName, Integer age) {
        EnrolID = enrolID;
        FullName = fullName;
        this.age = age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public String getFullName() {
        return FullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
