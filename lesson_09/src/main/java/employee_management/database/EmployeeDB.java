package employee_management.database;

import employee_management.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
    public static ArrayList<Employee> employees = new ArrayList<>(List.of(
            new Employee(1,"Nguyễn A","a@gmail.com",7_000_000),
            new Employee(2,"Nguyễn B","b@gmail.com",8_000_000),
            new Employee(3,"Nguyễn C","c@gmail.com",9_000_000),
            new Employee(4,"Nguyễn D","d@gmail.com",10_000_000),
            new Employee(5,"Nguyễn E","e@gmail.com",11_000_000),
            new Employee(6,"Nguyễn F","f@gmail.com",12_000_000)
            ));
}
