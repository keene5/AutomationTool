package com.todd.demospringfrontend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class WelcomeController {
    @RequestMapping("/")
    public String page(){
        return "index";
    }

//    @GetMapping(value = "/hello")
//    @ResponseBody
//    public String pageHello(){
//        return "index.html";
//    }
//
//
//
//
//    @RequestMapping(value = "/products")
//    public ResponseEntity<String> getProducts() {
//
//        return new ResponseEntity<>("My Products", HttpStatus.OK);
  //  }
}