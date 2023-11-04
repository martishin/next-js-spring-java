package com.ttymonkey.nextjsspringjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {
    @GetMapping("/name")
    public String getThreadName() throws InterruptedException {
        Thread.sleep(1000);
        return Thread.currentThread().toString();
    }
}
