package com.example.student.wsdl.response;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "age",
    "grade"
})
@XmlRootElement(name = "addStudentResponse", namespace = "http://example.com/student")
public class AddStudentResponse {

    @XmlElement(name = "id", required = false, namespace = "http://example.com/student")
    protected Long id;

    @XmlElement(name = "name", required = true, namespace = "http://example.com/student")
    protected String name;

    @XmlElement(name = "age", required = true, namespace = "http://example.com/student")
    protected Integer age;

    @XmlElement(name = "grade", required = true, namespace = "http://example.com/student")
    protected String grade;

    public Long getId() {
        return id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer value) {
        this.age = value;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String value) {
        this.grade = value;
    }

    // Default constructor required by JAXB
    public AddStudentResponse() {
    }
} 