
package com.mycourse.com.service;

import java.util.List;


public interface CrudService<DTO> {
    
    List<DTO> getAll();
    DTO save(DTO dto);
    void delete(int id) throws IllegalArgumentException;
    DTO update(int id, DTO dto);
}
