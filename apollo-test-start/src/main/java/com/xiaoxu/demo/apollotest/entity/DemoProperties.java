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

@Component
@RefreshScope
@ConfigurationProperties(prefix = "demo")
@Data
public class DemoProperties {

    @ApolloConfig
    private Config config;

    private String k1;

    private String k2;
    
    @Value("${demo.xiaoxu-k1}")
    private Long xiaoxuPk1;

    private Long xiaoxuK1;

    @ApolloConfigChangeListener
    public void onConfigChange(ConfigChangeEvent changeEvent) {
        // 当配置发生变化时，Apollo会自动更新配置值
        // 这里不需要额外的处理，因为@ConfigurationProperties会自动处理更新
        if (changeEvent.changedKeys().contains("demo.k1")) {
            this.k1 = config.getProperty("demo.k1", null);
        }
    }
}
