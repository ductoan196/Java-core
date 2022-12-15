package encapsulation_demo.person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setAge(27);
        person.setName("Đức Toàn");
        person.setEmail("toanvd2gmail.com");

        System.out.println(person);
    }
}
