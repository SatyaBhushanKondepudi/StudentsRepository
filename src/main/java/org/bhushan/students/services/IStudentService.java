package org.bhushan.students.services;

import org.bhushan.students.dtos.StudentCreationDTO;
import org.bhushan.students.exceptions.PhoneNumberException;
import org.bhushan.students.exceptions.StudentException;
import org.bhushan.students.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();

    Student createStudent(StudentCreationDTO studentCreationDTO) throws PhoneNumberException;

    Student getStudentById(int id) throws StudentException;
}
