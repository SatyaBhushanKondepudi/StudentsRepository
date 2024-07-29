package org.bhushan.students.controller;

import org.bhushan.students.dtos.StudentCreationDTO;
import org.bhushan.students.dtos.StudentCreationResponseDto;
import org.bhushan.students.dtos.StudentResponseDto;
import org.bhushan.students.exceptions.PhoneNumberException;
import org.bhushan.students.exceptions.StudentException;
import org.bhushan.students.models.Student;
import org.bhushan.students.services.IStudentService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    public IStudentService iStudentService;
    public ModelMapper modelMapper;
    public StudentController(IStudentService istudentService , ModelMapper modelMapper) {
        this.iStudentService = istudentService;
        this.modelMapper = modelMapper;
    }

    //GetAllStudents
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentsList = iStudentService.getAllStudents();
        return new ResponseEntity<>(studentsList, HttpStatus.OK);
    }

    //AddAStudent
    @PostMapping("/students")
    public ResponseEntity<String> createStudent(
            @RequestBody StudentCreationDTO studentCreationDTO) throws PhoneNumberException {
        Student student = iStudentService.createStudent(studentCreationDTO) ;
        StudentCreationResponseDto studentCreationResponseDto = new StudentCreationResponseDto();
        String responseMessage = "Created Successfully and Your ID :  " + student.getId() ;
        return new ResponseEntity<>(responseMessage , HttpStatus.CREATED);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentResponseDto> getStudentById(@PathVariable int id) throws StudentException {
        Student student = iStudentService.getStudentById(id);
        StudentResponseDto studentResponseDto = modelMapper.map(student, StudentResponseDto.class);
        return new ResponseEntity<>(studentResponseDto , HttpStatus.FOUND);
    }

}
