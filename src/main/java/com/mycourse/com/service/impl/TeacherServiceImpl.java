package com.mycourse.com.service.impl;

import com.mycourse.com.dto.TeacherDTO;
import com.mycourse.com.entity.Teacher;
import com.mycourse.com.mapper.TeacherMapper;
import com.mycourse.com.repository.TeacherRepository;
import com.mycourse.com.service.CrudService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements CrudService<TeacherDTO> {

    @Autowired
    TeacherRepository teacherRepo;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<TeacherDTO> getAll() {
        List<TeacherDTO> teachersDTOList = new ArrayList<>();
        for (Teacher teacher : this.teacherRepo.findAll()) {
            TeacherDTO teacherTransformed = this.teacherMapper.transformToDTO(teacher);
            teachersDTOList.add(teacherTransformed);
        }
        return teachersDTOList;
    }

    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        Teacher teacher = this.teacherMapper.transformToEntity(teacherDTO);
        Teacher savedTeacher = this.teacherRepo.save(teacher);
        return this.teacherMapper.transformToDTO(savedTeacher);

    }

    @Override
    public void delete(int id) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherDTO update(int id, TeacherDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
