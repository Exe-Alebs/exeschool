package com.exe.exeschool.services.courseService;

import com.exe.exeschool.Data.Course;
import com.exe.exeschool.Data.Student;

import java.util.List;
import java.util.Set;

public interface CourseService {

    Course getCourseById(Long id);

    Course getCourseByName(String name);

    List<Course> getAllCourses();

    Course createCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long id);

    Course addTeacherToCourse(Long courseId, Long teacherId);

    Course addStudentToCourse(Long courseId, Long studentId);

    Set<Student> getEnrolledStudents(Long id);

//    Set<Teacher> getEnrolledTeachers(Long id);

}
