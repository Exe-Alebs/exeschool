package com.exe.exeschool.services.courseService;

import com.exe.exeschool.Data.Course;
import com.exe.exeschool.Data.Student;

import java.util.List;
import java.util.Set;

public class CourseServiceImpl implements CourseService{
    @Override
    public Course getCourseById(Long id) {
        return null;
    }

    @Override
    public Course getCourseByName(String name) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course createCourse(Course course) {
        return null;
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }

    @Override
    public Course addTeacherToCourse(Long courseId, Long teacherId) {
        return null;
    }

    @Override
    public Course addStudentToCourse(Long courseId, Long studentId) {
        return null;
    }

    @Override
    public Set<Student> getEnrolledStudents(Long id) {
        return null;
    }
}
