
package com.mycourse.com.repository;

import com.mycourse.com.entity.School;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface SchoolRepository extends CrudRepository<School, Integer>{
    
    @Override
    List<School> findAll();
}
