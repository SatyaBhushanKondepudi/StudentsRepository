package org.bhushan.students.repositories;

import org.bhushan.students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student , Integer>{
    Student save(Student student);
    Student findByPhoneNumber(String phoneNumber);
//    @Query("SELECT MAX(Student.id) from Student ")
//    int findMaxID();
    Student getTopByOrderByIdDesc();



    boolean existsByPhoneNumber(String phoneNumber);
}
