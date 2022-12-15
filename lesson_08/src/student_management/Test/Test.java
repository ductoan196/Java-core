package student_management.Test;

import student_management.model.Student;
import student_management.service.StudentService;

public class Test {
    //CRUD: CREAT - READ - UPDATE - DELETE
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = studentService.createStudent();
        studentService.printInfo(student);
    }
}
