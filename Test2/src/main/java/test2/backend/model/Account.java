package test2.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @SerializedName("username")
    private String userName;

    private String email;
    private String password;
}
