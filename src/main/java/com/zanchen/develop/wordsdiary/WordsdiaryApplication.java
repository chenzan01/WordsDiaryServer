package com.zanchen.develop.wordsdiary;

import com.zanchen.develop.wordsdiary.util.JsonParserUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.zanchen.develop.wordsdiary.dao")
public class WordsdiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordsdiaryApplication.class, args);
//        new JsonParserUtil();
    }

}
