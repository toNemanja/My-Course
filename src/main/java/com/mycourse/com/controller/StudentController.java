
package com.mycourse.com.controller;

import com.mycourse.com.dto.StudentDTO;
import com.mycourse.com.service.impl.StudentServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentServiceImpl studentService;
    
    @GetMapping
    public List<StudentDTO> getAllStudents(){
        return studentService.getAll();
    }
    
    @PostMapping
    public StudentDTO save(@RequestBody StudentDTO student){
        return studentService.save(student);
    }
}
