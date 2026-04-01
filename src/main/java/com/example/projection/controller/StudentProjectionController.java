package com.example.projection.controller;

import com.example.projection.dto.StudentDTO;
import com.example.projection.entity.Student;
import com.example.projection.entproj.StudentProjection;
import com.example.projection.repository.StudentRepository;
import com.example.projection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentProjectionController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @GetMapping
    private List<StudentProjection> getStudentProjection() {
        return studentRepository.findAllCustomerDetails();
    }

    @GetMapping("/{dept}")
    private List<StudentProjection> findByDept(@PathVariable("dept") String dept) {
        return studentService.findByDept(dept);
    }

    @GetMapping("/dto/{dept}")
    private List<StudentDTO> findByDeptUsingDTOProjection(@PathVariable("dept") String dept) {
        return studentRepository.findByDeptUsingDTOProjection(dept);
    }

    @PostMapping("/post")
    public void storeStudent(@RequestBody Student student){
        studentRepository.save(student);
    }
}
