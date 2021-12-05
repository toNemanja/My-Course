
package com.mycourse.com.repository;

import com.mycourse.com.entity.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer>{
    @Override
    List<Student> findAll();
    
   
    
}
