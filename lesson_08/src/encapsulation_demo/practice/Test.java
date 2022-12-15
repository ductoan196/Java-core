package encapsulation_demo.practice;

public class Test {
    public static void main(String[] args) {
        Student std = new Student("12345678", 1, 15,"Ahb");
        System.out.println(std);
        std.calculateScholarship();
    }

}
