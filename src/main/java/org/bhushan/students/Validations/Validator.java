package org.bhushan.students.Validations;

import org.bhushan.students.models.Student;
import org.bhushan.students.repositories.StudentRepository;

public class Validator {
    private StudentRepository studentRepository;
    public Validator(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //PhoneNumber Validator :: Should accept only digits and length should be 10
    public static boolean validatePhoneNumber(String phoneNumber){
        if (phoneNumber.length() == 10 && phoneNumber.matches("[0-9]{10}")) {
            return true;
        }
        return false;
    }
}
