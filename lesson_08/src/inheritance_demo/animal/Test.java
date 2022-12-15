package inheritance_demo.animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky","white",4);
        dog.eat();
        dog.display();

        Dog dog1 = new Dog();
        dog1.setName("Pitbull");
        dog1.setColor("black");
        dog1.setLegs(4);

    }
}
