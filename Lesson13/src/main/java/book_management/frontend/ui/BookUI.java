package book_management.frontend.ui;

import book_management.backend.Exception.NotFoundException;
import book_management.backend.controller.BookController;
import book_management.backend.model.Book;
import book_management.backend.request.CreatBook;
import book_management.backend.request.UpdateBookRequest;

import java.util.List;
import java.util.Scanner;

public class BookUI {
        private final BookController bookController = new BookController();

        public void run() {
            Scanner sc = new Scanner(System.in);

            int option = 0;
            boolean isQuit = false;

            while (!isQuit) {
                showMenu();

                try {
                    System.out.print("Nhập lựa chọn : ");
                    option = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn không hợp lệ");
                    continue;
                }

                switch (option) {
                    case 1: {
                        List<Book> books = bookController.getBooks();
                        if (books.isEmpty()){
                            System.out.println("Không có quyển sách nào trong ds");
                        } else {
                            for (Book book: books){
                                System.out.println(book);
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Nhập tên sách: ");
                        String title = sc.nextLine();

                        List<Book> books = bookController.getBooksByTitle(title);
                        if (books.isEmpty()){
                            System.out.println("Không có quyển sách nào có tên: " + title);
                        } else {
                            System.out.println("Danh sách các sách có tên " + title + "là: ");
                            for (Book b: books){
                                System.out.println(b);
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Nhập id sách cần xóa: ");
                        int id = Integer.parseInt(sc.nextLine());
                        try {
                            bookController.deleteBook(id);
                        }catch (NotFoundException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    }

                    case 4:{
                        System.out.println("Nhập id cần chỉnh sửa: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập title cần chỉnh sửa: ");
                        String title = sc.nextLine();

                        System.out.println("Nhập author chỉnh sửa: ");
                        String author = sc.nextLine();

                        UpdateBookRequest request = new UpdateBookRequest(title,author);
                        Book book = bookController.updateBook(id,request);
                        System.out.println("Thông tin sách sau khi cập nhật là: ");
                        System.out.println(book);
                    }
                    case 5:{
                        System.out.println("Nhập id sách mới: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập title sách mới: ");
                        String title = sc.nextLine();

                        System.out.println("Nhập author sách mới: ");
                        String author = sc.nextLine();

                        System.out.println("Nhập pageNumber sách mới: ");
                        int pageNumber = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập pageNumber sách mới: ");
                        int releaseYear = Integer.parseInt(sc.nextLine());

                        CreatBook creatBook = new CreatBook(id,title,author, pageNumber,releaseYear);
                        Book book = bookController.newBook(creatBook);
                        System.out.println("Thông tin sách mới là: ");
                        System.out.println(book);
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
            System.out.println("3 - Xóa sách theo id");
            System.out.println("4 - Thay đổi thông tin book");
            System.out.println("5 - Tạo sách");
            System.out.println("6 - Thoát\n");
        }
    }
