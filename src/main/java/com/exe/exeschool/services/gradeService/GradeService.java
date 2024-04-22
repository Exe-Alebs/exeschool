package com.exe.exeschool.services.gradeService;

import com.exe.exeschool.Data.Grade;

import java.util.List;

public interface GradeService {
    Grade getGradeById(Long id);

    Grade getGradeByStudentAndCourse(Long studentId, Long courseId);

    Grade saveGrade(Grade grade);

    Grade saveGradeByStudentAndCourse(Long studentId, Long courseId, Grade grade);

    Grade updateGrade(Grade grade);

    Grade updateGradeByStudentAndCourse(Long studentId, Long courseId, Grade grade);

    List<Grade> getGradesByStudentId(Long studentId);

    List<Grade> getGradesByCourseId(Long courseId);

    List<Grade> getAllGrades();

    void deleteGrade(Long id);

    void deleteGradeByStudentAndCourse(Long studentId, Long courseId);

}
