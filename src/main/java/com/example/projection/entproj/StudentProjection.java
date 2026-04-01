package com.example.projection.entproj;

import org.springframework.beans.factory.annotation.Value;

public interface StudentProjection {
    String getName();
    String getDept();

    @Value("#{target.getName + ' '+target.getDept}")
    String getFullName();
}
