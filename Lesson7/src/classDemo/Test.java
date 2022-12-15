package classDemo;

public class Test {
    public static void main(String[] args) {
//        //Tạo ra đối tượng
//        Person person = new Person();
//        System.out.println(person.name);
//        System.out.println(person.age);
//
//        //Gán giá trị cho các thuộc tính đối tuượng
//        person.name = "Nguyễn văn A";
//        person.age = 20;
//        person.address = "Hà Nội";
//
//        //In ra các thông tin đối tượng
//        System.out.println(person.name +  "-" + person.address + "-" +  person.age);
//        person.showInfo();
//        person.eat();
//        person.play("Bóng đá");
//
//        System.out.println(person.toString());
//
//        //Khởi tạo đối tượng phone
//        Phone phone = new Phone();
//        phone.name = "Iphone 13 promax";
//        phone.brand = "Apple";
//
//        person.usePhone(phone);

        //Tạo ra đối tượng
        Calculator calculator = new Calculator();
        //Gán giá trị cho đối tượng
        calculator.number1 = 4;
        calculator.number2 = 2;
        //In ra giá trị
        calculator.printInfo();
        System.out.println(calculator.addition());
        System.out.println(calculator.multi());
        System.out.println(calculator.subtract());
        System.out.println(calculator.division());

        //Khởi tạo đối tượng với constructor
        Person person1 = new Person("Trần Văn B", "b@gmail.com");
        Person person2 = new Person("Trần Văn C", "c@gmail.com", 27, "Nam Định");
    }
}
