package practice_constructor;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Toàn",27, "Nam Định",150);
        System.out.println(employee.getSalary());

        Employee employee2 = new Employee("Linh",22,"Sơn Tây",120);
        System.out.println(employee2.toString());

        //Constructor
        Employee employee1 = new Employee("Toàn",27,"Nam Định",150);
        System.out.println(employee1.toString());
    }
}
