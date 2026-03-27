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
        mapper.getConfiguration()
                // avoid loose weird matches
                .setMatchingStrategy(MatchingStrategies.STRICT)
                // do not overwrite destination fields with nulls
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());
        return mapper;
    }

}
