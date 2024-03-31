package com.services.olzp.student.studentservice.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.olzp.student.studentservice.infrastructure.adapters.output.persistence.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
