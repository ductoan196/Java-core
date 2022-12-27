package student_management;

import book_management.backend.database.BookDB;
import book_management.backend.model.Book;
import student_management.backend.database.StudentDB;
import student_management.backend.model.Student;
import student_management.backend.utils.FileUtils;
import student_management.frontend.ui.StudentUI;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        for (Book b: BookDB.books){
            System.out.println(b);
        }
    }
}
