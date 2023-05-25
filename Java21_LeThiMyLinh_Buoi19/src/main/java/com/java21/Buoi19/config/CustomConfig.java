package com.java21.Buoi19.config;

import com.java21.Buoi19.model.StudentModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public StudentModel studentModel(){
        StudentModel studentModel = new StudentModel();
        studentModel.setAge(24);
        studentModel.setName("Ho Anh Dao");
        return studentModel;
    }

}
