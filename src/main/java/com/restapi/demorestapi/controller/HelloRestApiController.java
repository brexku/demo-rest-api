package com.restapi.demorestapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloRestApiController {

    @GetMapping("/hello")
    public String helloRestApiController() {
        return "Hello SpringBoot Rest Api!";
    }

}
