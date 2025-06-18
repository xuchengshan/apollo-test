package com.xiaoxu.demo.apollotest.entity;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "demo")
@Data
public class DemoProperties {

    @ApolloConfig
    private Config config;

    @Value("demo.k1")
    private String k1;

    private String k2;
    
    @Value("${demo.xiaoxu-k1}")
    private Long xiaoxuPk1;

    private Long xiaoxuK1;

//    @PostConstruct
//    public void init() {
//        System.out.println("DemoProperties 初始化完成");
//        System.out.println("当前配置值：");
//        System.out.println("k1: " + k1);
//        System.out.println("k2: " + k2);
//        System.out.println("xiaoxuPk1: " + xiaoxuPk1);
//        System.out.println("xiaoxuK1: " + xiaoxuK1);
//    }
//
//    @ApolloConfigChangeListener
//    public void onConfigChange(ConfigChangeEvent changeEvent) {
//        System.out.println("配置发生变更：" + changeEvent.changedKeys());
//        for (String key : changeEvent.changedKeys()) {
//            System.out.println("变更的配置项：" + key);
//            System.out.println("旧值：" + changeEvent.getChange(key).getOldValue());
//            System.out.println("新值：" + changeEvent.getChange(key).getNewValue());
//        }
//    }
}
