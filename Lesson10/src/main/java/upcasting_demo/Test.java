package upcasting_demo;

public class Test {
    public static void main(String[] args) {
        //Upcasting
        Person p = new Student("Toàn");
        p.work();
        p.sleep();
        p.eat();
        ((Student) p).display();

        //Dowcasting
    }
}
