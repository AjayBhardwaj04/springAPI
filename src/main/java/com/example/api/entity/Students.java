package com.example.api.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tools.jackson.databind.ObjectMapper;

@Entity
@Getter
@Setter
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Students {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id ;

        @JsonSetter(nulls = Nulls.SKIP)
        private String email = getEmail();

        @JsonSetter(nulls = Nulls.SKIP)
        private String name = getName();


}

// Usage


