package test_remove;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Toàn","Ltt");
        Student student2 = new Student(2,"Linh","Sơn Tây");
        Student student3 = new Student(3,"Kiên","Bắc Giang");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student s: students){
            System.out.println(s);
        }

//        //findbyID
//        for(Student s: students){
//            if (s.getId() == 3 ){
//                students.remove(s);
//            }
//        }

        System.out.println(students.remove(student2));
    }
}
