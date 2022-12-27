package book_management.backend.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class CreatBookRequest {
    private String title;
    private List<String> categories;
    private String author;
    private int pageNumber;
    private int releaseYear;

    public CreatBookRequest(String title, String author, int pageNumber, int releaseYear) {
        this.title = title;
        this.categories = new ArrayList<>();
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseYear = releaseYear;
    }

}
