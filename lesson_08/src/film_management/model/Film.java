package film_management.model;

public class Film {
    private int day,month, year;
    Date date = new Date();
    private int id;
    private String title;
    private String category;
    private String director;

    public Film() {
    }

    public Film(Date date, int id, String title, String category, String director) {
        this.date = date;
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "date=" + date +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
