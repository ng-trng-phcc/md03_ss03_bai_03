package com.example.coursemanagentsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Instructor {
    private Integer id;
    private String name;
    private String email;
}
