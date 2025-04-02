package com.example.student.wsdl.request;

import com.example.student.model.Student;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "addStudentRequest", namespace = "http://example.com/student")
public class AddStudentRequest {

    @XmlElement(name = "student", required = true, namespace = "http://example.com/student")
    protected Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student value) {
        this.student = value;
    }

    // Default constructor required by JAXB
    public AddStudentRequest() {
    }
} 