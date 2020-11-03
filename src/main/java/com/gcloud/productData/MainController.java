package com.gcloud.productData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MainController {

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

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

}
