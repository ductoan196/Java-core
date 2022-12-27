package book_management.frontend.ui;

import book_management.backend.controller.BookController;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.CreatBookRequest;
import book_management.backend.request.UpdateBookRequest;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookUI {
    private final BookController bookController= new BookController();

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
                    List<Book> books = bookController.getBooks();
                    if (books.isEmpty()){
                        System.out.println("Không có quyển sách nào nằm trong danh sách");
                    }else {
                        for (Book b: books){
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Nhập vào tên cuốn sách: ");
                    String name = sc.nextLine();

                    List<Book> books = bookController.getBooksByName(name);
                    if (books.isEmpty()){
                        System.out.println("Không có cuốn sách nào có tên là: "+ name);
                    } else {
                        System.out.println("Danh sách book có tên "+ name + " là: ");
                        for (Book b: books){
                            System.out.println(b);
                        }
                    }
                }
                break;

                case 3:{
                    System.out.println("Nhập Id cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());

                    try {
                        bookController.deleteBook(id);
                    }catch (NotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 4:{
                    System.out.println("Nhập vào id cần chỉnh sửa");
                    int id= Integer.parseInt(sc.nextLine());

                    System.out.println("Nhập vào tiêu đề");
                    String title= sc.nextLine();

                    System.out.println("Nhập vào tác giả");
                    String author= sc.nextLine();

                    UpdateBookRequest request = new UpdateBookRequest(title, author);
                    try{
                        Book book = bookController.updateBook(id, request);
                        System.out.println("Thông tin sách sau khi cập nhật là: ");
                        System.out.println(book);

                    } catch (NotFoundException e){
                        System.out.println(e.getMessage());
                    }
                }
                case 5:{
                    Random rd = new Random();
                    int id = rd.nextInt();
                    System.out.println("Nhập vào title");
                    String title = sc.nextLine();

                    System.out.println("Nhập vào author");
                    String author = sc.nextLine();

                    System.out.println("Nhập vào pageNumber");
                    int pageNumber = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhập vào releaseYear");
                    int releaseYear = Integer.parseInt(sc.nextLine());

                    CreatBookRequest request = new CreatBookRequest(title, author, pageNumber,releaseYear);
                    Book book= bookController.creatBook(request);
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
