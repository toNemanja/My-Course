
package com.mycourse.com.repository;

import com.mycourse.com.entity.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Integer>{
    
}
