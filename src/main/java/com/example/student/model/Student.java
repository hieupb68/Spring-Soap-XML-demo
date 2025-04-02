package com.example.student.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", namespace = "http://example.com/student", propOrder = {
    "id",
    "name",
    "age",
    "grade"
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement(name = "id", required = false)
    private Long id;

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "age", required = true)
    private Integer age;

    @XmlElement(name = "grade", required = true)
    private String grade;

    // Default constructor required by JAXB
    public Student() {
    }
} 