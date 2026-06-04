package org.example.Entity;

public class Student {
    private int id;
    private String name;
    private String course;
    private int adharno;


    public Student(int id,String name,String course,int adharno) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.adharno = adharno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAdharno() {
        return adharno;
    }

    public void setAdharno(int adharno) {
        this.adharno = adharno;
    }

    public void displayinfo() {
        System.out.println("Student id :"+id);
        System.out.println("student name is :"+name);
        System.out.println("Student course :"+ course);
        System.out.println("Student adharno :"+adharno);
    }
}
