package player_management;

import player_management.model.Position;

public class Test {
    public static void main(String[] args) {
       Position position = Position.GK;
        System.out.println(position);

        for (Position p: Position.values()){
            System.out.println(p);
        }

        Position position1 = position.GK;
        System.out.println(position1.getValues());
    }
}
