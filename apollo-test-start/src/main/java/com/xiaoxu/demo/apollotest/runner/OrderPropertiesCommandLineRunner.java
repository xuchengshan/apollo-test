package com.xiaoxu.demo.apollotest.runner;

import com.xiaoxu.demo.apollotest.entity.DemoProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderPropertiesCommandLineRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DemoProperties orderProperties;

    @Override
    public void run(String... args) {
        logger.info("getKey1:" + orderProperties.getK1());
        logger.info("getKey2:" + orderProperties.getK2());
        logger.info("getXiaoxuK1:" + orderProperties.getXiaoxuK1());
    }

}