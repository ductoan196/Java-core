package book_management.backend.request;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CreatBook {
    private int id;
    private String title;
    private List<String> categories;
    private String author;
    private int pageNumber;
    private int releaseYear;

    public CreatBook(int id, String title, String author, int pageNumber, int releaseYear) {
        this.id = id;
        this.title = title;
        this.categories = new ArrayList<>();
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseYear = releaseYear;
    }
}
