package org.example.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private String branch;
    private String adress;
    private String hobby;

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${student.branch}")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Value("${student.adress}")
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void display() {
        System.out.println("Name of Student : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Address : " + adress);
        System.out.println("Hobby : " + hobby);
    }
}