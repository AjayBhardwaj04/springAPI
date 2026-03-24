package com.example.api.controller;

import com.example.api.dto.studentDto;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class studentController {

   private final studentService studentService;



    @GetMapping("/students")
    public List<studentDto> getStudent() {
        return studentService.getAllStudents();

    }
    @GetMapping("/students/{ID}")
    public studentDto getAllStudentsById( @PathVariable long ID) {
        return studentService.getById(ID);
    }
}
