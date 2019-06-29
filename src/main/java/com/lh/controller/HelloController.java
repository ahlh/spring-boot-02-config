package com.lh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanliu7
 * @describe
 * @date 2019/6/29 17:53
 */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping
    public String sayHello() {
        return "hello" + name;
    }
}
