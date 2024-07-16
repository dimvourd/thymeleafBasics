package com.luv2code.springboot.thymeleafdemo.controller;


import com.luv2code.springboot.thymeleafdemo.entities.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Value("${countries}")
    public List<String> countries;

    @GetMapping("/requestStudent")
    public String callHttml(Model model){
        model.addAttribute("countries", countries);
        model.addAttribute("student", new Student());
        return "studentHtmls/student-request-form";
    }

//    @PostMapping("/createStudent")
//    public String createStudent(Model model,
//                                @RequestParam("firstName")String firstName,
//                                @RequestParam("lastName")String lastName,
//                                @RequestParam("email")String email,
//                                @RequestParam("country") String country) {
//        Student student = new Student();
//        student.setEmail(email);
//        student.setFirstName(firstName);
//        student.setLastName(lastName);
//        student.setCountry(country);
//
//        model.addAttribute("student", student);
//
//        return "studentHtmls/student-responce-form";
//    }

    @PostMapping("/createStudent")
    public String createStudent(Model model, @Valid @ModelAttribute("student") Student student){

        model.addAttribute("student", student);

        return "studentHtmls/student-responce-form";
    }

}
