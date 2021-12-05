
package com.mycourse.com.controller;

import com.mycourse.com.dto.SchoolDTO;
import com.mycourse.com.service.impl.SchoolServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
    
    @Autowired
    SchoolServiceImpl schoolService;
    
    @GetMapping
    public List<SchoolDTO> getAll(){
        return schoolService.getAll();
    }
    
    @PostMapping SchoolDTO save(@RequestBody SchoolDTO schoolDTO){
        return schoolService.save(schoolDTO);
    }
}
