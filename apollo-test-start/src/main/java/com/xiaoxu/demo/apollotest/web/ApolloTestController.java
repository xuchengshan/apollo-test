package com.xiaoxu.demo.apollotest.web;

import com.xiaoxu.demo.apollotest.service.ApolloTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apollo")
public class ApolloTestController {

    @Autowired
    private ApolloTestService apolloTestService;

    @GetMapping("/getDemo")
    public String getName() {
        return apolloTestService.getDemo();
    }

    @GetMapping("/api-getDemo")
    public String apiGetDemo(@RequestParam("key") String key) {
        return apolloTestService.apiGetDemo(key);
    }
}
