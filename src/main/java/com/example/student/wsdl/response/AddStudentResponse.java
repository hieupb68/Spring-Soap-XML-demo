package com.example.student.wsdl.response;

import com.example.student.model.Student;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "addStudentResponse", namespace = "http://example.com/student")
public class AddStudentResponse {

    @XmlElement(name = "student", required = true, namespace = "http://example.com/student")
    protected Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student value) {
        this.student = value;
    }

    // Default constructor required by JAXB
    public AddStudentResponse() {
    }
} 