package arraylist_demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Method
        numbers.add(0,10);
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(100,200));
        numbers.addAll(numbers1);
        System.out.println(numbers);

        System.out.println(numbers.contains(100));
        System.out.println(numbers.get(0));

        ArrayList<String> names = new ArrayList<>(List.of("Toan","Linh"));
        System.out.println(names);
    }
}
