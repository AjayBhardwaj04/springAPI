package com.example.api.service;

import com.example.api.dto.studentDto;

import java.util.List;

public  interface studentService {
    List<studentDto> getAllStudents();

     studentDto getById(long id);
}
