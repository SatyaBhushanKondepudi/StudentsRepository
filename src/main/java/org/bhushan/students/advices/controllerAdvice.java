package org.bhushan.students.advices;

import org.bhushan.students.dtos.ErrorDto;
import org.bhushan.students.exceptions.PhoneNumberException;
import org.bhushan.students.exceptions.StudentException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class controllerAdvice {
    ErrorDto errorDto = new ErrorDto();

    @ExceptionHandler(PhoneNumberException.class)
    public ResponseEntity<ErrorDto> phonenumberException
            (PhoneNumberException e) {
        errorDto.setMessage(e.getMessage());
        return new ResponseEntity<>(errorDto , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(StudentException.class)
    public ResponseEntity<ErrorDto> StudentException
            (StudentException e) {
        errorDto.setMessage(e.getMessage());
        return new ResponseEntity<>(errorDto , HttpStatus.BAD_REQUEST);
    }


}
