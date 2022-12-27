package book_management.backend.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UpdateBookRequest {
    private String title;
    private String author;
}
