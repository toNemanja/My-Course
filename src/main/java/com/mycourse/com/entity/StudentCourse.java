
package com.mycourse.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity(name="student_course")
@Getter @Setter @NoArgsConstructor
public class StudentCourse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    @Column(name = "developer_course_id", nullable = false)
    private Integer courseId;
    @Column(name = "classes_bought", nullable = false)
    private Integer classesBought;

    public StudentCourse(Integer studentId, Integer courseId, Integer classesBought) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.classesBought = classesBought;
    }
    
}
