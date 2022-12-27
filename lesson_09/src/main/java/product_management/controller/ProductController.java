package product_management.controller;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    public void run(){
        boolean isQuit = false;
        int option =0;
        while (!isQuit){
            showMenu();
            System.out.print("Nhập vào lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
//                case 1:{
//                    System.out.print("Nhập tên sách muốn tìm kiếm: ");
//                    String title = sc.nextLine();
//                    bookService.findByTitle(title);
//                    break;
//                }
//                case 2:{
//                    System.out.print("Nhập thể loại muốn tìm kiếm: ");
//                    String category = sc.nextLine();
//                    bookService.findByCategory(category);
//                    break;
//                }
//                case 3:{
//                    bookService.findByPublishYear();
//                    break;
//                }
                case 4:{
                    isQuit=true;
                }
            }
        }
    }
    public static void showMenu(){
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm kiếm sản phẩm theo tên");
        System.out.println("3 - Tìm kiếm sản phẩm theo Id");
        System.out.println("4 - Tìm kiếm sản phẩm có số lượng dưới 5");
        System.out.println("5 - Tìm kiếm sản phẩm theo mức giá");
        System.out.println("6 - Thoát\n");
    }
}
