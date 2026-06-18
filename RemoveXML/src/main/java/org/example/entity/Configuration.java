package org.example.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("org.example.entity")
public class Configuration {

    @Bean
    public Mark createMark() {
        System.out.println("Mark Bean Created");
        return new Mark();
    }

    @Bean
    public Student student() {
        System.out.println("Student Bean Created");

        Student student = new Student();
        student.setMark(createMark());

        return student;
    }
}