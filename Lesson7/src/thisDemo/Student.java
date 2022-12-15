package thisDemo;

public class Student {
    public String name;
    public int age;
    public Gender gender;

    public Student() {
    }

    public Student(String name) {
        System.out.println();
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, Gender gender) {
        this(name, age);
        this.gender = gender;
    }

}
