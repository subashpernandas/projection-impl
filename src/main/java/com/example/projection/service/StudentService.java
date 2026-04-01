package com.example.projection.service;

import com.example.projection.entproj.StudentProjection;
import com.example.projection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentProjection> findByDept(String dept) {
        return studentRepository.findByDept(dept);
    }
}
