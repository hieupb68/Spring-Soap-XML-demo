package com.example.student.wsdl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId"
})
@XmlRootElement(name = "getStudentRequest", namespace = "http://example.com/student")
public class GetStudentRequest {

    @XmlElement(required = true)
    protected Long studentId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long value) {
        this.studentId = value;
    }
} 