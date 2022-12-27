package student_management.backend.repository;

import book_management.backend.database.BookDB;
import student_management.backend.database.StudentDB;
import student_management.backend.model.Student;

import java.util.List;

public class StudentRepository {
    public List<Student> findAll() {
        return StudentDB.students;
    }
}
