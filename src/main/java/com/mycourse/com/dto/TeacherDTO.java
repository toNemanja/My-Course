package com.mycourse.com.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherDTO implements Serializable {

    private Integer id;
    private String name;
    private String surname;
    private String mail;

}
