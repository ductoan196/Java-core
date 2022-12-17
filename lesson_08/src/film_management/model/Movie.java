package film_management.model;

public class Movie extends Film{
    private int duration;

    public Movie(Date date, int id, String title, String category, String director, int duration) {
        super(date, id, title, category, director);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
