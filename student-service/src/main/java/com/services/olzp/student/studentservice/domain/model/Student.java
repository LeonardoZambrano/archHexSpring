package com.services.olzp.student.studentservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String address;

}
