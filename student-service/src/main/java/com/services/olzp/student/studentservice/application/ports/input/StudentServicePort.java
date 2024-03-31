package com.services.olzp.student.studentservice.application.ports.input;

import com.services.olzp.student.studentservice.domain.model.Student;
import java.util.List;

public interface StudentServicePort {

    Student findById(long id);

    List<Student> findAll();

    Student save(Student student);

    Student update(Long id, Student student);

    void delete(Long id);

}
