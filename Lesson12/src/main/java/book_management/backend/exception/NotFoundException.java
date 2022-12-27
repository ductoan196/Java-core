package book_management.backend.exception;

import book_management.backend.Utils.FileUtils;
import book_management.backend.database.BookDB;
import book_management.backend.model.Book;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
