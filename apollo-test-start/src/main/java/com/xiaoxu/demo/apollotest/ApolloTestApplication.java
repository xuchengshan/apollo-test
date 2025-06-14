package com.xiaoxu.demo.apollotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.xiaoxu"})
public class ApolloTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloTestApplication.class, args);
    }

}
