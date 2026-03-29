package com.example.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class studentDto {
    private String id ;

    @JsonSetter(nulls = Nulls.SKIP)
    private String email = getEmail();

    @JsonSetter(nulls = Nulls.SKIP)
    private String name = getName();

}
