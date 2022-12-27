package team_management.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Player {
    private int number;
    private String name;
    private Position positon;
}
