package student_management.frontend.ui;

import book_management.backend.controller.BookController;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.CreatBookRequest;
import book_management.backend.request.UpdateBookRequest;
import student_management.backend.controller.StudentController;
import student_management.backend.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentUI {
    private final StudentController studentController= new StudentController();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {

                    List<Student> students = studentController.getStudents();
                    if (students.isEmpty()){
                        System.out.println("Không có học sinh nào nằm trong danh sách");
                    }else {
                        for (Student s: students){
                            System.out.println(s);
                        }
                    }
                    break;
                }
                case 6: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }


    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Xem danh sách books");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Xóa sách theo Id");
        System.out.println("4 - Thay đổi thông tin book");
        System.out.println("5 - Tạo một cuốn sách");


        System.out.println("6 - Thoát\n");
    }
}
