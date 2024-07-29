package org.bhushan.students.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseDto {
    private int studentId;
    private String studentName;
    private String departmentName ;
    private String phoneNumber;
}
