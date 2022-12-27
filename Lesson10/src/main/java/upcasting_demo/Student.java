package upcasting_demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    public void display(){
        System.out.println("My name is "+ this.getName());
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating");;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName()+ " is working");
    }

}
