package com.services.olzp.student.studentservice.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.services.olzp.student.studentservice.application.ports.input.StudentServicePort;
import com.services.olzp.student.studentservice.application.ports.output.StudentPersistencePort;
import com.services.olzp.student.studentservice.domain.exception.StudentNotFoundException;
import com.services.olzp.student.studentservice.domain.model.Student;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort {

    private final StudentPersistencePort studentPersistencePort;

    @Override
    public Student findById(long id) {
        return studentPersistencePort.findById(id).orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<Student> findAll() {
        return studentPersistencePort.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentPersistencePort.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        return studentPersistencePort.findById(id).map(saveStudent -> {
            saveStudent.setFirstName(student.getFirstName());
            saveStudent.setLastName(student.getLastName());
            saveStudent.setAge(student.getAge());
            saveStudent.setAddress(student.getAddress());
            return studentPersistencePort.save(saveStudent);
        }).orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public void delete(Long id) {
        if (studentPersistencePort.findById(id).isEmpty()) {
            throw new StudentNotFoundException();
        }
        studentPersistencePort.deleteById(id);
    }
}
