package com.java21.Buoi19.controller;

import com.java21.Buoi19.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentModel studentModel;
    @GetMapping("")
    public String get() {
        return "student page";
    }
    List<StudentModel> list = new ArrayList<>();
    @PostMapping("/requestParam")
    public ResponseEntity<?> testRequestParam(@RequestParam String name, @RequestParam int age) {
        studentModel.setAge(age);
        studentModel.setName(name);
        list.add(studentModel);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/requestBody")
    public ResponseEntity<?> testRequestBody(@RequestBody StudentModel studentModel) {
        list.add(studentModel);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/pathVariable/{name}/{age}")
    public ResponseEntity<?> testPathVariable(@PathVariable("name") String name, @PathVariable("age") int age/*, StudentModel studentModel*/){
        studentModel.setAge(age);
        studentModel.setName(name);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}