package com.example.projection.repository;

import com.example.projection.dto.StudentDTO;
import com.example.projection.entity.Student;
import com.example.projection.entproj.StudentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Interface Based Projection
    List<StudentProjection> findAllBy();

    // Custom Query Projection
    @Query("SELECT s.name AS name, s.dept AS dept FROM Student s")
    List<StudentProjection> findAllCustomerDetails();

    List<StudentProjection> findByDept(String dept);

    // Class-based Projection (DTO)
    @Query("SELECT new com.example.projection.dto.StudentDTO(s.name, s.age, s.dept) FROM Student s WHERE s.dept=:dept")
    List<StudentDTO> findByDeptUsingDTOProjection(@Param("dept") String dept);

}
