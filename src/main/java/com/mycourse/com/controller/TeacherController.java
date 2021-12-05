
package com.mycourse.com.controller;

import com.mycourse.com.dto.TeacherDTO;
import com.mycourse.com.service.impl.TeacherServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    
    @Autowired
    TeacherServiceImpl teacherService;
    
    @GetMapping
    public  List<TeacherDTO> getAllTeachers(){
        return teacherService.getAll();
    }
    
    @PostMapping
    public TeacherDTO saveTeacher(@RequestBody TeacherDTO teacherDTO){
        return this.teacherService.save(teacherDTO);
    }
}
