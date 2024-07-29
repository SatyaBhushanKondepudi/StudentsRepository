package org.bhushan.students.dtos;

import lombok.Getter;
import lombok.Setter;
import org.bhushan.students.exceptions.PhoneNumberException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Getter
@Setter
public class ErrorDto {
    private String message;
}
