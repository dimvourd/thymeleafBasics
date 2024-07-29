package com.luv2code.springboot.thymeleafdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MVCController {

    @GetMapping("/hello")
    public String hello(Model theModel){

        theModel.addAttribute("theDate", LocalDateTime.now());
        return "helloworld";
    }

}
