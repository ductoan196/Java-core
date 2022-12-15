package book_management.controller;

import book_management.service.BookService;

import java.util.Scanner;

public class BookController {
    BookService bookService = new BookService();
    Scanner sc = new Scanner(System.in);
    public void run(){
        boolean isQuit = false;
        int option =0;
        while (!isQuit){
            showMenu();
            System.out.print("Nhập vào lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:{
                    System.out.print("Nhập tên sách muốn tìm kiếm: ");
                    String title = sc.nextLine();
                    bookService.findByTitle(title);
                    break;
                }
                case 2:{
                    System.out.print("Nhập thể loại muốn tìm kiếm: ");
                    String category = sc.nextLine();
                    bookService.findByCategory(category);
                    break;
                }
                case 3:{
                    bookService.findByPublishYear();
                    break;
                }
                case 4:{
                    isQuit=true;
                }
            }
        }
    }
    public static void showMenu(){
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tìm kiếm book theo tên");
        System.out.println("2 - Tìm kiếm book theo thể loại");
        System.out.println("3 - Tìm kiếm book theo năm phát hành");
        System.out.println("4 - Thoát\n");
    }
}
