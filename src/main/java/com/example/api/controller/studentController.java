package com.example.api.controller;

import com.example.api.dto.studentDto;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class studentController {

   private final studentService studentService;



    @GetMapping("/students")
    public  ResponseEntity< studentDto> getStudent() {
//        return ResponseEntity.status(HttpStatus.OK).body((studentDto) studentService.getAllStudents());
        return ResponseEntity.ok((studentDto) studentService.getAllStudents());

    }
    @GetMapping("/students/{ID}")
    public ResponseEntity<studentDto> getAllStudentsById(@PathVariable long ID) {
        return ResponseEntity.status(HttpStatus.OK ).body(studentService.getById(ID));
    }
}
