
package com.mycourse.com.repository;

import com.mycourse.com.entity.Teacher;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>{
    
    @Override
    List<Teacher> findAll();
}
