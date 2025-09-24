package org.example.jpastudente24amain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStudentE24AmainApplication {

    public static final Logger logger = LoggerFactory.getLogger(
            JpaStudentE24AmainApplication.class
    );


    public static void main(String[] args) {
        SpringApplication.run(JpaStudentE24AmainApplication.class, args);
    }

}
