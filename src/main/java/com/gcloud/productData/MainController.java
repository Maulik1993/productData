package com.gcloud.productData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MainController {

    @RestController
    public class HelloWorld {

        @Autowired
        ProductsDAO productsDAO;

        @GetMapping("/")
        private String defaultCall(){
            return "Hello There from MS2";
        }

        @GetMapping("/HelloWorld")
        private String sample(){
            return "Hello World from MS2";
        }

        @RequestMapping(value = "/product/{Id}", method = RequestMethod.GET)
        private String fetchProductName(@PathVariable("Id") String productId){
            return productsDAO.getProductNameById(productId);

        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

}
