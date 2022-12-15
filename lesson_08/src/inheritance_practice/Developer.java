package inheritance_practice;

public class Developer extends Employee {
    private int overTimeHours;

    public Developer() {
    }

    public Developer(int id, String name, int age, String phone, String email, int basicSalary, int overTimeHours) {
        super(id, name, age, phone, email, basicSalary);
        this.overTimeHours = overTimeHours;
    }
    //Tính lương
    public int DeveloperSalary(){
        return this.getBasicSalary() + this.overTimeHours*200000;
    }
    //
    public int getOverTimeHours(){
        return overTimeHours;
    }
}
