package com.complex.student.service;

import com.complex.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        List<Student> studentList = List.of(
                new Student("Raghu Sama",
                        "Ravinder Reddy",
                        21,
                        "8th",
                        "III",
                        21),

                new Student("Harika S",
                        "Sathyanarayana",
                        20,
                        "8th",
                        "II",
                        20)
        );
        System.out.println(studentList);
        return studentList;
    }
}
