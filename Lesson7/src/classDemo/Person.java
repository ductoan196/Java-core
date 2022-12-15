package classDemo;

public class Person {
    //Thuộc tính (property)
    public String name;
    public String email;
    public int age;
    public String address;

    //Constructor
    public Person(){

    }

    //Constructor 2 tham số
    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    //Constructor 4 tham số
    public Person(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    // Phương thức: method - hành động
    public void play(String sportName){
        System.out.println("Chơi " + sportName);
    }
    public void eat(){
        System.out.println("Ăn ... ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(name +  "-" + address + "-" +  age);

    }
    public void usePhone(Phone phone){
        System.out.println(name + "Đang sử dụng điện thoại "+ phone.name + " của hãng " + phone.brand);
    }

}
