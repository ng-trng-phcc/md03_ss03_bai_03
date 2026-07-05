package com.example.coursemanagentsystem.controllers;

import com.example.coursemanagentsystem.models.Instructor;
import com.example.coursemanagentsystem.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    @ResponseBody
    public List<Instructor> findAll() {
        return instructorService.findAll();
    }
}
