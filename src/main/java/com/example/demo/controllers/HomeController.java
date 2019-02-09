package com.example.demo.controllers;

import com.example.demo.models.Application;
import com.example.demo.models.Course;
import com.example.demo.models.Student;
import com.example.demo.repositories.ApplicationRepository;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ApplicationRepository applicationRepository;

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/add")
    public String courseForm(Model model){
        model.addAttribute("course", new Course());
        return "courseform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Course course, BindingResult result){
        if (result.hasErrors()){
            return "courseform";
        }
        courseRepository.save(course);
        return "redirect:/";
    }

    @GetMapping("/application")
    public String getApplication(Model model){
        model.addAttribute("application", new Application());
        return "application_form";
    }

    @PostMapping("/processApplication")
    public String processApplication(@Valid Application application,
                                     BindingResult result){
        if(result.hasErrors()){
            return "application_form";
        }
        applicationRepository.save(application);
        return "redirect:/";
    }


    @GetMapping("/studentForm")
    public String getStudentForm(Model model){
        model.addAttribute("student", new Student());
        return "studentform";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@Valid Student student,
                                     BindingResult result){
        if(result.hasErrors()){
            return "studentform";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showCourse(@PathVariable("id") long id, Model model){
        model.addAttribute("course", courseRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateCourse(@PathVariable("id") long id, Model model){
        model.addAttribute("course", courseRepository.findById(id).get());
        return "courseform";
    }

    @RequestMapping("/delete/{id}")
    public String delCourse(@PathVariable("id") long id){
        courseRepository.deleteById(id);
        return "redirect:/";
    }

}


