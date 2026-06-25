package org.example.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan("org.example.entity")
@PropertySource("classpath:student.properties")
public class Configuration {
}