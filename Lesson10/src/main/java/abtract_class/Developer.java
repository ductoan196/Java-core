//package abtract_class;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//
//public class Developer extends Employee {
//    public int overtimeHours;
//
//    public Developer(int id, String name, int age, int salaryBasic, int overtimeHours) {
//        super(id, name, age, salaryBasic);
//        this.overtimeHours = overtimeHours;
//    }
//
//    @Override
//    public int getCalculateSalary() {
//        return this.getSalaryBasic() + this.overtimeHours*200_000;
//    }
//}
