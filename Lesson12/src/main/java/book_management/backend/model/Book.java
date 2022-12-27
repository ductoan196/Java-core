package book_management.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    //id, title, category, author, pageNumber, releaseYear
    private int id;
    private String title;

    @SerializedName("category")
    private List<String> categories;

    private String author;

    @SerializedName("page_number")
    private int pageNumber;

    @SerializedName("release_year")
    private int releaseYear;
}
