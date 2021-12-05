package com.mycourse.com.service.impl;

import com.mycourse.com.dto.SchoolDTO;
import com.mycourse.com.entity.School;
import com.mycourse.com.mapper.SchoolMapper;
import com.mycourse.com.repository.SchoolRepository;
import com.mycourse.com.service.SchoolService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepo;

    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public List<SchoolDTO> getAll() {
        List<SchoolDTO> schoolDTO = new ArrayList<>();
        for (School school : this.schoolRepo.findAll()) {
            SchoolDTO schoolToSave = this.schoolMapper.transformToDTO(school);
            schoolDTO.add(schoolToSave);
        }
        return schoolDTO;
    }

    @Override
    public SchoolDTO save(SchoolDTO dto) {
        School school = this.schoolMapper.transformToEntity(dto);
        School schoolSaved = this.schoolRepo.save(school);
        return this.schoolMapper.transformToDTO(schoolSaved);
    }

    @Override
    public void delete(int id) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SchoolDTO update(int id, SchoolDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
