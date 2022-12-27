package student_management.backend.controller;

import student_management.backend.model.Student;
import student_management.backend.repository.StudentRepository;
import student_management.backend.service.StudentService;

import java.util.List;

public class StudentController {
    private final StudentService studentService = new StudentService();
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
