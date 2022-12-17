package employee_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;
}
