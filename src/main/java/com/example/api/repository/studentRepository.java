package com.example.api.repository;

import com.example.api.dto.studentDto;
import com.example.api.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Students,Long > {



}
