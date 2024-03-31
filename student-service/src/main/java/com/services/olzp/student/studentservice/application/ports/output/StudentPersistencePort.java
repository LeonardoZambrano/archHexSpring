package com.services.olzp.student.studentservice.application.ports.output;

import java.util.Optional;
import java.util.List;

import com.services.olzp.student.studentservice.domain.model.Student;

public interface StudentPersistencePort {

    Optional<Student> findById(Long id);

    List<Student> findAll();

    Student save(Student student);

    void deleteById(Long id);
}
