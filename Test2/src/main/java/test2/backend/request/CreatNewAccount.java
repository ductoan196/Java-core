package test2.backend.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CreatNewAccount {
    private String username;
    private String email;
    private String password;
}
