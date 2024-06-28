package com.java.springboot.config;
import com.java.springboot.util.Oss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Oss ailiyunOss() {
        return new Oss();
    }
}
