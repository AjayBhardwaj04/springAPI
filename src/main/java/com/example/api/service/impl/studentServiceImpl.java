package com.example.api.service.impl;

import com.example.api.dto.addStudentReqDTO;
import com.example.api.dto.studentDto;
import com.example.api.entity.Students;
import com.example.api.repository.studentRepository;
import com.example.api.service.studentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class studentServiceImpl  implements studentService {

    private final studentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<studentDto> getAllStudents(String name) {
        return List.of();
    }

    @Override
    public List<studentDto> getAllStudents() {
        List<Students> students = studentRepository.findAll();
        return  students.stream().map(student -> modelMapper.map(students,studentDto.class)).toList();
//
//        return students.stream() //
//                .map(student ->
//                        new studentDto(student.getId(),student.getName(),student.getEmail())).toList();

    }



    @Override
    public  studentDto getById(long id) {
        Students students= studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student id not found " + id));
       return modelMapper.map(students,studentDto.class);
    }

    @Override
    public studentDto addNewStudent(addStudentReqDTO addStudentReqDTO) {
        Students newStudent = modelMapper.map(addStudentReqDTO,Students.class);
        Students students = studentRepository.save(newStudent);
        return modelMapper.map(students,studentDto.class);
    }
}
