package com.exe.exeschool.services.studentService;

import com.exe.exeschool.Data.Course;
import com.exe.exeschool.Data.Student;


import java.util.List;
import java.util.Set;

public interface StudentService {
    public Student createStudent(Student student);

    public Student updateStudent(Student student);

    public Student getStudentById(Long id);

    public Student getStudentByName(String name);

    public List<Student> getAllStudents();

    Set<Course> getEnrolledCourses(Long id);

    public void deleteStudent(Long id);
}
