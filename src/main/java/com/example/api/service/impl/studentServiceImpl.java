package com.example.api.service.impl;

import com.example.api.dto.studentDto;
import com.example.api.entity.Students;
import com.example.api.repository.studentRepository;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class studentServiceImpl  implements studentService {

    private final studentRepository repository;

    @Override
    public List<studentDto> getAllStudents() {
        List<Students> students = repository.findAll();
        return students.stream()
                .map(student ->
                        new studentDto(student.getId(),student.getName(),student.getEmail())).toList();

    }


    @Override
    public studentDto getById(long id) {
        return studentRepository.
    }


//    @Override
//    public  studentDto getById(long id) {
//        Students students= studentService.getById(id).orElseThrow(() -> new IllegalArgumentException("Student id not found " + id));
//        return new studentDto(students.getId(),students.getName(),students.getEmail());
//    }
}
