package com.example.api.service.impl;

import com.example.api.dto.studentDto;
import com.example.api.entity.Students;
import com.example.api.repository.studentRepository;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class studentServiceImpl  implements studentService {

    private final studentRepository repository;

    @Override
    public List<studentDto> getStudents() {
        List<Students> students = repository.findAll();
        Stream<studentDto> studentDtoList = students.stream().map(student -> new studentDto(student.getId(),student.getName(),student.getEmail()));
        return List.of();
    }
}
