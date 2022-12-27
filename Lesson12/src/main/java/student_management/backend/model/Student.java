package student_management.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
    private int id;
    private String name;
    private String school;
    private String address;

}
