package com.example.coursemanagentsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Enrollment {
    private Integer id;
    private String studentName;
    private Integer courseId;
}
