package upcasting_demo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;

    public void eat(){
        System.out.println("People eat...");
    }
    public void work(){
        System.out.println("People work...");
    }
    public void sleep(){
        System.out.println("People sleep...");
    }

}