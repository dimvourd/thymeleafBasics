package com.luv2code.springboot.thymeleafdemo;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    // method show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }

    @RequestMapping("/processForm2")
    public String upperCase(HttpServletRequest request, Model model){

        // read the request parameter from the HTML and turn it to Upper Case
        String nameUpper =request.getParameter("studentName").toUpperCase();

        request.setAttribute("studentName2", nameUpper);

        model.addAttribute("message", "yo!"+ nameUpper);

        return "process-form2";
    }

    @PostMapping(value = "/processForm3")
    // this is the same thing with writting @GetMapping
    public String upperCase2(Model model,
                             @RequestParam(name = "studentName") String student){

        student = student.toUpperCase();

        model.addAttribute("message", student);
        return "process-form2";
    }

}
