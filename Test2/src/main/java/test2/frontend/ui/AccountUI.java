package test2.frontend.ui;

import test2.backend.controller.AccountController;
import test2.backend.model.Account;
import test2.backend.request.CreatNewAccount;

import java.util.List;
import java.util.Scanner;

public class AccountUI {

    AccountController accountController = new AccountController();

    public void run() {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMainMenu();

            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }

            switch (option) {
                case 1: {
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();

                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    List<Account> accounts = accountController.verifyAccount(email, password);
                    if (accounts.isEmpty()) {
                        System.out.println("Tài khoản hoặc mật khẩu không chính xác");
                    } else {
                        int subOption = 0;
                        boolean isSubQuit = false;

                        while (!isSubQuit) {
                            showSubMenu();
                            try {
                                System.out.print("Nhập lựa chọn : ");
                                subOption = Integer.parseInt(sc.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Lựa chọn không hợp lệ");
                                continue;
                            }

                            switch (subOption) {
                                case 1: {
                                    System.out.println("Nhập vào user mới: ");
                                    String newUserName = sc.nextLine();
                                    accountController.updateUser(email, newUserName);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Nhập vào email mới: ");
                                    String newEmail = emailValid();
                                    accountController.updateEmail(newEmail, password);
                                    break;
                                }
                                case 3: {
                                    System.out.println("Nhập vào password mới: ");
                                    String newPassword = passwordValid();
                                    accountController.updatePass(email, newPassword);
                                    break;
                                }
                                case 4:{
                                    isSubQuit =true;
                                    break;
                                }

                                case 5: {
                                    isSubQuit =true;
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

                    break;
                }
                case 2:{
                    System.out.println("Nhập vào username TK mới: ");
                    String username = sc.nextLine();
                    String email = emailValid();
                    String password = passwordValid();
                    CreatNewAccount request = new CreatNewAccount(username,email,password);
                    Account account = accountController.creatAccount(request);

                    break;
                }

                case 3:{
                    System.out.println("Nhập email của bạn: ");
                    String email = sc.nextLine();
                    accountController.checkEmailExist(email);

                    System.out.println("Nhập password mới: ");
                    String password = sc.nextLine();
                    Account account = accountController.updatePass(email,password);
                    break;
                }

                case 4: {
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

    public static void showMainMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Thoát\n");
    }
    public static void showSubMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát chương trình\n");
    }
    private String emailValid(){
        Scanner sc = new Scanner(System.in);
        boolean testEmail = false;

        String email = "";
        while (!testEmail){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if(accountController.checkEmailType(email)){
                if(!accountController.checkEmailExist(email)){
                    testEmail = true;
                } else {
                    System.out.println("Email đã tồn tại");
                }
            } else {
                System.out.println("Email không đúng định dạng");
            }
        }
        return email;
    }
    private String passwordValid(){
        boolean testPassword = false;
        Scanner sc = new Scanner(System.in);

        String password = "";
        while (!testPassword){
            System.out.println("Nhập password");
            password = sc.nextLine();
            if(accountController.checkPassType(password)){
                testPassword = true;
            } else {
                System.out.println("Password không đúng định dạng");
            }
        }
        return password;
    }

}
