package com.example.api.service;

import com.example.api.dto.addStudentReqDTO;
import com.example.api.dto.studentDto;

import java.util.List;

public  interface studentService {
    List<studentDto> getAllStudents(String name);

    List<studentDto> getAllStudents();

    studentDto getById(long id);

    studentDto addNewStudent(addStudentReqDTO addStudentReqDTO);
}
