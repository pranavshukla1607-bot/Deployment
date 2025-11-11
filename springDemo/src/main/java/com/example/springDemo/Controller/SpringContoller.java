package com.example.springDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringContoller {

    @GetMapping("/get")
    public String getMap() {

        return "ok";
    }

    @GetMapping("/gets")
    public String getapp() {

        return "ok";
    }
}
