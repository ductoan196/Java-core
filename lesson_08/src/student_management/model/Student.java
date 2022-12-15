package student_management.model;

import java.util.Random;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    Random rd= new Random();
    public int id;
    public String name;
    public double theoryPoint;
    public double practicePoint;

    public Student() {
    }

    public Student(int id, String name, double theoryPoint, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }
}

