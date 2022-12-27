package book_management.backend;

import book_management.backend.database.BookDB;
import book_management.backend.model.Book;
import book_management.frontend.ui.BookUI;

public class Test {
    public static void main(String[] args) {
        BookUI bookUI = new BookUI();
        bookUI.run();
    }
}
