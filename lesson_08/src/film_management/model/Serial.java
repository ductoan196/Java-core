package film_management.model;

public class Serial extends Film{
    private int partNumbers;
    private double avgDuration;

    public Serial(Date date, int id, String title, String category, String director, int partNumbers, double avgDuration) {
        super(date, id, title, category, director);
        this.partNumbers = partNumbers;
        this.avgDuration = avgDuration;
    }
}
