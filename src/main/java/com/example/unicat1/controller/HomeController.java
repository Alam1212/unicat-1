package com.example.unicat1.controller;

import com.example.unicat1.model.Courses;
import com.example.unicat1.model.Inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute Inquiry inquiry, Model model){
        System.out.println(inquiry.getKeyword());
        System.out.println(inquiry.getCategory());
        System.out.println(inquiry.getRating());

        List<Courses> courses = new ArrayList<Courses>();
        courses.add(new Courses("HTML",
                "ALAm",
                "Basic HTML.",
                40, 4, 20));

        courses.add(new Courses("MVC",
                "ALam",
                "Google",
                40, 5, 15));

        courses.add(new Courses("JS",
                "Ala,",
                "Basic",
                35, 5, 20));

        courses.add(new Courses("Swift",
                "Bob",
                "Intermediate",
                32, 5, 12));

        courses.add(new Courses("DATA Analiz",
                "MAK",
                "Intermediate",
                30, 5, 13));

        courses.add(new Courses("Springboot",
                "ALa",
                "Intermediate",
                40, 5, 12));

        model.addAttribute("courses", courses);
        return "courses";
    }
}
