
package com.mycourse.com.mapper;

import com.mycourse.com.dto.StudentDTO;
import com.mycourse.com.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    
    public StudentDTO transformToDTO(Student student){
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student, studentDTO);
        return studentDTO;
    }
    
    public Student transformToEntity(StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        return student;
    }
}
