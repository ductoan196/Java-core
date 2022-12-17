import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {

        //Cách 1: Sử dụng constructor
        Person person = new Person(1, "Đức Toàn", "vdt@gmail.com");
        System.out.println(person);
        //Cách 2: Sử dụng builder
        Person person1 = Person.builder()
                .email("ductoan@gmail.com")
                .id(10)
                .name("Linh")
                .build();
        System.out.println(person1);

        //Tạo nhiều đối tượng person
        Faker faker = new Faker();
        Person[] people = new Person[20];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(i+1,faker.name().fullName(),faker.internet().emailAddress());
        }
        for (Person p: people){
            System.out.println(p);
        }
    }
}
