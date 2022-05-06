package com.zanchen.develop.wordsdiary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zanchen.develop.wordsdiary.dao")
public class WordsdiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordsdiaryApplication.class, args);
    }

}
