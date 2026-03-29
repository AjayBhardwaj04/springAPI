package com.example.api.controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.api.dto.addStudentReqDTO;
import com.example.api.dto.studentDto;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class studentController {

   private final studentService studentService;



    @GetMapping("")
    public  ResponseEntity< List<studentDto>> getAllStudents() {
//        return studentService.getAllStudents();
//        return ResponseEntity.status(HttpStatus.OK).body((studentDto) studentService.getAllStudents());
//        return ResponseEntity.status(HttpStatus.OK).body( studentService.getAllStudents().stream().toList());
          return ResponseEntity.ok(studentService.getAllStudents());
    }
    @GetMapping("/{ID}")
    public ResponseEntity<studentDto> getAllStudentsById(@PathVariable long ID) {
//        return ResponseEntity.status(HttpStatus.OK ).body(studentService.getById(ID));
        return ResponseEntity.ok(studentService.getById(ID));
    }

    @PostMapping
    public ResponseEntity<studentDto> addToNewStudent(@RequestBody addStudentReqDTO addStudentReqDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addNewStudent(addStudentReqDTO));
    }


}
