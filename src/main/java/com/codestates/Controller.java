package com.codestates;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Validated
public class Controller {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application!";
    }
}
