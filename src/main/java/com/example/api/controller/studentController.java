package com.example.api.controller;

import com.example.api.dto.studentDto;
import com.example.api.entity.Students;
import com.example.api.repository.studentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class studentController {

   private final studentRepository studentRepository;

    public studentController(studentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Students> getStudent() {
        return studentRepository.findAll();

    }
}

