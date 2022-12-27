package student_management.backend.database;

import student_management.backend.model.Student;
import student_management.backend.utils.FileUtils;

import java.util.List;

public class StudentDB {
    public static List<Student> students = FileUtils.getDataFromFile("student.json");
}
