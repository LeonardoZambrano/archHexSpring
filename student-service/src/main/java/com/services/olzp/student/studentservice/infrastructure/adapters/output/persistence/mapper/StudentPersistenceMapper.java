
package com.services.olzp.student.studentservice.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import java.util.List;

import com.services.olzp.student.studentservice.domain.model.Student;
import com.services.olzp.student.studentservice.infrastructure.adapters.output.persistence.entities.StudentEntity;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {

    StudentEntity toStudentEntity(Student student);

    Student toStudent(StudentEntity studentEntity);

    List<Student> toStudentList(List<StudentEntity> studentEntityList);

}
