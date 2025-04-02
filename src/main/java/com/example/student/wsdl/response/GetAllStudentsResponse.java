package com.example.student.wsdl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "students"
})
@XmlRootElement(name = "getAllStudentsResponse", namespace = "http://example.com/student")
public class GetAllStudentsResponse {

    @XmlElement(name = "student", required = true, namespace = "http://example.com/student")
    protected List<StudentInfo> students;

    public List<StudentInfo> getStudents() {
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }

    public void setStudents(List<StudentInfo> value) {
        this.students = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "age",
        "grade"
    })
    public static class StudentInfo {
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
    }
} 