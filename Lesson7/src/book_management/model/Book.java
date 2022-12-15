package book_management.model;

public class Book {
    public int id;
    public String title;
    public String author;
    public String publisher;
    public int year;
    public String category;

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, int year, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", category='" + category + '\'' +
                '}';
    }
}
