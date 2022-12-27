package employee_management.repository;

import employee_management.database.EmployeeDB;
import employee_management.exception.NotFoundException;
import employee_management.model.Employee;

import java.util.ArrayList;

public class EmployeeRepository {
    public static ArrayList<Employee> findAll(){
        return EmployeeDB.employees;
    }

    public void save(Employee employee){
        EmployeeDB.employees.add(employee);
    }

    public ArrayList<Employee> findByNameContainsIgnoresCase(String name){
        ArrayList<Employee> rs = new ArrayList<>();
        for (Employee e: EmployeeDB.employees){
            if(e.getName().toLowerCase().contains(name.toLowerCase())){
                rs.add(e);
            }
        }
        return rs;
    }
    public Employee findById(int id){
        int count =0;
        for(Employee e: EmployeeDB.employees){
            if (e.getId() == id){
                System.out.println(e);
                count ++;
            }
        }
        throw new NotFoundException();
    }
    public void deleteById(int id){
        int count =0;
        ArrayList<Employee> rs = new ArrayList<>();
        for(Employee e: EmployeeDB.employees){
            if (e.getId() == id){
                rs.remove(e);
                count ++;
            }
        }
        if (count ==0){
            System.out.print("Không có nhân viên có id: " + id);
        }

    }
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary){
        int count =0;
        ArrayList<Employee> rs = new ArrayList<>();
        for(Employee e: EmployeeDB.employees){
            if (e.getSalary()>= 5_000_000 & e.getSalary()<=10_000_000){
                System.out.println("Xóa khỏi danh sách phần tử: " + e);
                count ++;
                rs.add(e);
            }
        }
        if (count ==0){
            System.out.print("Không có nhân viên có mức lương từ 5- 10tr");
        }
        return rs;
    }
}
