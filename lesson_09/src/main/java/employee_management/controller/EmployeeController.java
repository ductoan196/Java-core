package employee_management.controller;

import employee_management.model.Employee;
import employee_management.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();
    ArrayList<Employee> employees = employeeRepository.findAll();
    public void run() {
        int option = 0;
        boolean isQuit = false;
        while (!isQuit){
            showMenu();
            System.out.println("Nhập vào lựa chọn muốn thực hiện: ");
            option = sc.nextInt();
            switch (option){
                case 1:{
                    for(Employee employee: employeeRepository.findAll()){
                        System.out.println(employee);
                    }
                }
                case 2:{
                    System.out.print("Nhập vào id: ");
                    System.out.print("Nhập vào tên: ");
                    System.out.print("Nhập vào email: ");
                    System.out.print("Nhập vào salary: ");
                }
                case 3:{
                    System.out.println("Nhập vào id:");
                    int id = sc.nextInt();
                    employeeRepository.deleteById(id);
                }
            }
        }
    }

    public static void showMenu(){
        System.out.println("\n********* MENU *********");
        System.out.println("1 - In ra thông tin tất cả nhân viên");
        System.out.println("2 - Thêm nhân viên mới");
        System.out.println("3 - Tìm kiếm nhân viên theo name");
        System.out.println("4 - Tìm kiếm nhân viên theo id");
        System.out.println("5 - Xóa nhân viên theo id");
        System.out.println("6 - Tìm kiếm nhân viên có mức lương từ 5.000.000 --> 10.000.000");
        System.out.println("7 - Thoát\n");
    }
}
