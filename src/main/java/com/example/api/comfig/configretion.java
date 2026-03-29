package com.example.api.comfig;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configretion {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
//       mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
       return mapper;
    }

}
