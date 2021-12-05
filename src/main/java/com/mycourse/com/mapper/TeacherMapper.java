package com.mycourse.com.mapper;

import com.mycourse.com.dto.TeacherDTO;
import com.mycourse.com.entity.Teacher;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    public TeacherDTO transformToDTO(Teacher teacher) {

        TeacherDTO teacherDTO = new TeacherDTO();
        BeanUtils.copyProperties(teacher, teacherDTO);
        return teacherDTO;
    }

    public Teacher transformToEntity(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherDTO, teacher);
        return teacher;
    }
}
