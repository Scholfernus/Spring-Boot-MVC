package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("/students")
    public String getStudentsList() {
        return "students/personList";
    }
    @GetMapping("/addStudent")
    public String getAddStudent(){
        return "students/addNewPerson";
    }
    @GetMapping("/editStudent")
    public String getEditStudent(){
        return "students/editPerson";
    }
}
