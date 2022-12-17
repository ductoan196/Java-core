import employee_management.controller.EmployeeController;
import employee_management.database.EmployeeDB;

public class Test {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.run();
    }
}
