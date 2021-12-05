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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "cost_per_class", nullable = false)
    private Integer costPerClass;
    @Column(name = "classes_per_week", nullable = false)
    private Integer classesPerWeek;
    
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			   fetch = FetchType.LAZY)
	@JoinTable(name="student_course",
				joinColumns=@JoinColumn(name="course_id"), 
				inverseJoinColumns= @JoinColumn(name="student_id")
	)
	@JsonIgnore
	private List<Student> students;
    
      @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			   fetch = FetchType.LAZY)
	@JoinTable(name="teacher_course",
				joinColumns=@JoinColumn(name="course_id"), 
				inverseJoinColumns= @JoinColumn(name="teacher_id")
	)
	@JsonIgnore
	private List<Teacher> teachers;

    public Course(String name, Integer costPerClass, Integer classesPerWeek) {
        this.name = name;
        this.costPerClass = costPerClass;
        this.classesPerWeek = classesPerWeek;
    }
    
}
