package player_management.model;

public enum Position {
    GK("Goal Keeper"), DF("Defender"), MF("Midfilder Forward"), FW("Forward Wing");

    private String values;

    Position(String values) {
        this.values = values;
    }
    public String getValues(){
        return values;
    }
}
