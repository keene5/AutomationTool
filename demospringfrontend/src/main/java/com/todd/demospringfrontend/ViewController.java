package com.todd.demospringfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    //The index html found in templates will be returned a port 8080/
    // - notice the HTML is in the templates directory this is the springboot default directory
    @RequestMapping("/")
    public String page(){
        return "index";
    }
}