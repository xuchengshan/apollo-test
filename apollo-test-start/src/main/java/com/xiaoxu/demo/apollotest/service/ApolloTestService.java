package com.xiaoxu.demo.apollotest.service;


import com.xiaoxu.demo.apollotest.entity.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApolloTestService {

    @Autowired
    private DemoProperties demoProperties;

    public String getDemo() {
        return demoProperties.getK1() + "," +  demoProperties.getK2() + "," + demoProperties.getXiaoxuK1();
    }

}
