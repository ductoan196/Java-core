package student_management.backend.service;

import student_management.backend.model.Student;
import student_management.backend.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository = new StudentRepository();
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
