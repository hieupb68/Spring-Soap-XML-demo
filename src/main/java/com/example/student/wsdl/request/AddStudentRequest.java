package com.example.student.wsdl.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "age",
    "grade"
})
@XmlRootElement(name = "addStudentRequest", namespace = "http://example.com/student")
public class AddStudentRequest {

    @XmlElement(name = "name", required = true, namespace = "http://example.com/student")
    protected String name;

    @XmlElement(name = "age", required = true, namespace = "http://example.com/student")
    protected Integer age;

    @XmlElement(name = "grade", required = true, namespace = "http://example.com/student")
    protected String grade;

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
    public AddStudentRequest() {
    }
} 