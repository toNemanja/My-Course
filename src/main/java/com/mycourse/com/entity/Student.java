package com.mycourse.com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 250)
    private String name;
    @Column(name = "surname", nullable = false, length = 250)
    private String surname;
    @Column(name = "account_name", nullable = false, length = 250, unique = true)
    private String accountName;
    @Column(name = "password", nullable = false, length = 250)
    private String password;
    @Column(name = "email", nullable = false, length = 250, unique = true) 
    private String email;
    @Column(name = "bank_card_number", nullable = false, length = 16)
    private Integer bankCardNumber;
    
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    @JsonIgnore
    private List<Course> courses;
    
    @ManyToOne
    private School school;

    public Student(String name, String accountName, String password, String email,
            int bankCardNumber) {
        this.name = name;
        this.accountName = accountName;
        this.password = password;
        this.email = email;
        this.bankCardNumber = bankCardNumber;
    }

}
