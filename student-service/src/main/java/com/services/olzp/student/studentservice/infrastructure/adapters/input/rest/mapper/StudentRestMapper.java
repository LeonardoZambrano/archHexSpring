package com.services.olzp.student.studentservice.infrastructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.services.olzp.student.studentservice.domain.model.Student;
import com.services.olzp.student.studentservice.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.services.olzp.student.studentservice.infrastructure.adapters.input.rest.model.response.StudentResponse;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {

    Student toStudent(StudentCreateRequest request);

    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStudentResponseList(List<Student> studentList);

}
