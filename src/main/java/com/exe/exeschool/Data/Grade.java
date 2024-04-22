package com.exe.exeschool.Data;

import java.io.Serializable;

import com.exe.exeschool.common.EntityData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "grade", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "teacher_id", "course_id", "student_id" })
})
public class Grade extends EntityData implements Serializable {

    @Column(name = "score", nullable = false)
    private int score;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

}
