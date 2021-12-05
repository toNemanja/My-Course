package com.mycourse.com.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SchoolDTO implements Serializable {

    // private int id;
    private String name;
    private String adress;
    private int schoolId;
}
