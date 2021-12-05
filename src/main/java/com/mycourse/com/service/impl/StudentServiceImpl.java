package com.mycourse.com.service.impl;

import com.mycourse.com.dto.StudentDTO;
import com.mycourse.com.entity.Student;
import com.mycourse.com.mapper.StudentMapper;
import com.mycourse.com.repository.StudentRepository;
import com.mycourse.com.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getAll() {
        List<StudentDTO> studentDTOlist = new ArrayList<>();
        List<Student> studentList = studentRepo.findAll();
        for (Student student : studentList) {
            studentDTOlist.add(studentMapper.transformToDTO(student));
        }
        return studentDTOlist;
    }

    @Override
    public StudentDTO save(StudentDTO dto) {
        System.out.println("Prva izmena");
        System.out.println("Druga izmena");
        Student student = this.studentMapper.transformToEntity(dto);
        return this.studentMapper.transformToDTO(studentRepo.save(student));
    }

    @Override
    public void delete(int id) throws IllegalArgumentException {
        Student student = this.studentRepo.findById(id).get();
        if (student != null) {
            this.studentRepo.delete(student);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public StudentDTO update(int id, StudentDTO dto) {
        Student student = this.studentRepo.findById(id).get();
        if (student == null) {
            throw new IllegalArgumentException();
        }

        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        student.setEmail(dto.getEmail());
        student.setAccountName(dto.getAccountName());
        student.setBankCardNumber(dto.getBankCardNumber());
        student.setPassword(dto.getPassword());
        Student newStudent = this.studentRepo.save(student);
        return this.studentMapper.transformToDTO(newStudent);
    }

}
