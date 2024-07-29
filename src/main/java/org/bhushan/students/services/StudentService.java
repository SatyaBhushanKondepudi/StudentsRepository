package org.bhushan.students.services;

import org.bhushan.students.Validations.Validator;
import org.bhushan.students.dtos.StudentCreationDTO;
import org.bhushan.students.exceptions.PhoneNumberException;
import org.bhushan.students.exceptions.StudentException;
import org.bhushan.students.models.Student;
import org.bhushan.students.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements  IStudentService {
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(StudentCreationDTO studentCreationDTO) throws PhoneNumberException {
        Student newStudent = new Student();
        newStudent.setName(studentCreationDTO.getName());
        if (studentRepository.existsByPhoneNumber(studentCreationDTO.getPhoneNumber())) {
            throw new PhoneNumberException("The Provided PhoneNumber already Exists");
        }else if(Validator.validatePhoneNumber(studentCreationDTO.getPhoneNumber())){
            newStudent.setPhoneNumber(studentCreationDTO.getPhoneNumber());
        }else{
            throw new PhoneNumberException("Phone Number Validation Failed. Kindly use only 10 digits");
        }

        newStudent.setDepartmentName(studentCreationDTO.getDepartmentName());
        Student savedStudent = studentRepository.save(newStudent);

        System.out.println(savedStudent);
        return savedStudent;
    }

    @Override
    public Student getStudentById(int id) throws StudentException {
        Student student = studentRepository.findById(id).orElse(null);

        if(student == null){
            throw new StudentException("Student with "+ id + " not found. Use a value which is less than " + studentRepository.getTopByOrderByIdDesc().getId());
        }
        return student;
    }
}
