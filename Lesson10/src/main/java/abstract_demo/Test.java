package abstract_demo;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Developer(1,"Nguyễn Văn A",20,5_000_000,40);
        System.out.println(employee.calculateSalary());

        Employee employee1 = new Tester(2,"Nguyễn B",27,5_000_000,20);
        System.out.println(employee1.calculateSalary());

        //Tạo một danh sách nhân viên
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(new Developer(3,"Nguyễn C",28,6_000_000,30));
        employees.add(new Tester(4,"Nguyễn D",30,7_000_000,50));

        for (Employee e: employees){
            System.out.println(e.calculateSalary());
        }

        //Sắp xếp theo lương giảm dần
        System.out.println("Sắp xếp lương giảm dần");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 1,0, -1
                return o2.calculateSalary() - o1.calculateSalary();
            }
        });
        for (Employee e: employees){
            e.showInfo();
        }

        //Sắp xếp tuổi tăng dần
        System.out.println("\nSắp xếp tuổi tăng dần");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Employee e: employees){
            e.showInfo();
        }

        //Demo sử dụng stream (demo)
        //Stream, reference, lambda expression (java8)
//        employees.forEach(Employee::showInfo); //reference
        //Lambda
        employees.forEach(e -> e.showInfo() );
    }

}
