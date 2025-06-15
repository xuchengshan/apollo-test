package com.xiaoxu.demo.apollotest.service;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.xiaoxu.demo.apollotest.entity.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApolloTestService {

    @Autowired
    private DemoProperties demoProperties;
    @ApolloConfig
    private Config config;

    public String getDemo() {
        return demoProperties.getK1() + "," +  demoProperties.getK2() + "," + demoProperties.getXiaoxuK1() + "," + demoProperties.getXiaoxuPk1();
    }

    public String apiGetDemo(String key) {
        return config.getProperty(key,null);
    }
}
