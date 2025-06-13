package com.xiaoxu.demo.apollotest.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ValueCommandLineRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value(value = "${demo.k1}")
    private String key1;

    @Value(value = "${demo.k2}")
    private String key2;

    @Value(value = "${demo.xiaoxu-k1}")
    private Long xiaoxuK1;

    @Override
    public void run(String... args) {
        logger.info("key1:" + key1);
        logger.info("key2:" + key2);
        logger.info("xiaoxuK1:" + xiaoxuK1);
    }
}
