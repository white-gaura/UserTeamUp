package com.whitecrow.cva;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author WhiteCrow
 */
@SpringBootApplication
@MapperScan("com.whitecrow.cva.mapper")
public class CvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvaApplication.class, args);
    }

}
