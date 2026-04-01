package com.example.projection.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Integer id;

    private String name;
    private String dept;
    private Integer age;

    public StudentDTO(String name, Integer age, String dept) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }
}
