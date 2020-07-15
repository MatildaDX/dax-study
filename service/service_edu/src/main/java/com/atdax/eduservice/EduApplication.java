package com.atdax.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : CoderDax
 * @date : Created in 2020/7/15 20:08
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atdax")
public class EduApplication {

    public static void main(String[] args){
        SpringApplication.run(EduApplication.class,args);
    }

}
