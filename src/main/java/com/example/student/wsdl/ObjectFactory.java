package com.example.student.wsdl;

import com.example.student.model.Student;
import com.example.student.wsdl.request.AddStudentRequest;
import com.example.student.wsdl.request.GetAllStudentsRequest;
import com.example.student.wsdl.request.GetStudentRequest;
import com.example.student.wsdl.response.AddStudentResponse;
import com.example.student.wsdl.response.GetAllStudentsResponse;
import com.example.student.wsdl.response.GetStudentResponse;
import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    
    public ObjectFactory() {
        // Default constructor
    }

    public Student createStudent() {
        return new Student();
    }

    public GetStudentRequest createGetStudentRequest() {
        return new GetStudentRequest();
    }

    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    public AddStudentRequest createAddStudentRequest() {
        return new AddStudentRequest();
    }

    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    public GetAllStudentsRequest createGetAllStudentsRequest() {
        return new GetAllStudentsRequest();
    }

    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }
} 