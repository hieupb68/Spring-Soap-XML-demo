package com.example.student.wsdl.response;

import com.example.student.model.Student;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "students"
})
@XmlRootElement(name = "getAllStudentsResponse", namespace = "http://example.com/student")
public class GetAllStudentsResponse {

    @XmlElement(required = true)
    protected List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> value) {
        this.students = value;
    }
} 