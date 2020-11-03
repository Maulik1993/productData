package com.gcloud.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    private String defaultCall(){
        return "Hello There from MS2";
    }

    @GetMapping("/HelloWorld")
    private String sample(){
        return "Hello World from MS2";
    }
}

