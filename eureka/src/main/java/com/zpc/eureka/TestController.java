package com.zpc.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/gtest")
    public Object test() {
        return "hello gateway";
    }
}
