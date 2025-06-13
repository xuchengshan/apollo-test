package com.xiaoxu.demo.apollotest.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
@Data
public class DemoProperties {

    private String k1;

    private String k2;

    private Long xiaoxuK1;
}
