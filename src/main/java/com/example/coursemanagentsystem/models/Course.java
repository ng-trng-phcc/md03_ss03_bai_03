package com.example.coursemanagentsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    private Integer id;
    private String title;
    private String status;
    private Integer instructorId;
}
