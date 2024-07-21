package com.complex.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student/api/1.0/info")
public class StudentController {

    @GetMapping
    public List<String> findAllStudents() {
        return List.of(
                "Hello World",
          "Raghu", "Vamshi","Prakash"
        );
    }

}
