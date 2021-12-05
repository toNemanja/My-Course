
package com.mycourse.com.mapper;

import com.mycourse.com.dto.SchoolDTO;
import com.mycourse.com.entity.School;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SchoolMapper {
    
   public SchoolDTO transformToDTO(School school){
       SchoolDTO schoolDTO = new SchoolDTO();
       BeanUtils.copyProperties(school, schoolDTO);
       return schoolDTO;
   }
   
   public School transformToEntity(SchoolDTO schoolDTO){
       School school = new School();
       BeanUtils.copyProperties(schoolDTO, school);
       return school;
   }
    
}
