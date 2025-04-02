package com.example.student.endpoint;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import com.example.student.wsdl.request.AddStudentRequest;
import com.example.student.wsdl.request.GetAllStudentsRequest;
import com.example.student.wsdl.request.GetStudentRequest;
import com.example.student.wsdl.response.AddStudentResponse;
import com.example.student.wsdl.response.GetAllStudentsResponse;
import com.example.student.wsdl.response.GetStudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class StudentEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(StudentEndpoint.class);
    private static final String NAMESPACE_URI = "http://example.com/student";

    @Autowired
    private StudentService studentService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public GetStudentResponse getStudent(@RequestPayload GetStudentRequest request) {
        GetStudentResponse response = new GetStudentResponse();
        Student student = studentService.getStudent(request.getStudentId());
        response.setStudent(student);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllStudentsRequest")
    @ResponsePayload
    public GetAllStudentsResponse getAllStudents(@RequestPayload GetAllStudentsRequest request) {
        GetAllStudentsResponse response = new GetAllStudentsResponse();
        List<Student> students = studentService.getAllStudents();
        response.setStudents(students);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addStudentRequest")
    @ResponsePayload
    public AddStudentResponse addStudent(@RequestPayload AddStudentRequest request) {
        logger.debug("Received addStudent request: {}", request);
        
        try {
            if (request == null || request.getStudent() == null) {
                logger.error("Student cannot be null");
                throw new IllegalArgumentException("Student cannot be null");
            }

            Student requestStudent = request.getStudent();
            logger.debug("Processing student: name={}, age={}, grade={}", 
                requestStudent.getName(), requestStudent.getAge(), requestStudent.getGrade());

            // Create new Student instance for saving
            Student newStudent = new Student();
            newStudent.setName(requestStudent.getName());
            newStudent.setAge(requestStudent.getAge());
            newStudent.setGrade(requestStudent.getGrade());
            
            // Save student and get the complete saved entity
            Student savedStudent = studentService.saveStudent(newStudent);
            logger.debug("Student saved successfully with id: {}", savedStudent.getId());
            
            // Create response with complete student data
            AddStudentResponse response = new AddStudentResponse();
            response.setStudent(savedStudent);
            
            logger.debug("Returning response with student: id={}, name={}, age={}, grade={}", 
                savedStudent.getId(), savedStudent.getName(), savedStudent.getAge(), savedStudent.getGrade());
                
            return response;
        } catch (Exception e) {
            logger.error("Error processing addStudent request", e);
            throw e;
        }
    }
} 