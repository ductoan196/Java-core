package book_management.backend.controller;

import book_management.backend.model.Book;
import book_management.backend.request.CreatBook;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.service.BookService;

import java.util.List;

public class BookController {
    private final BookService bookService = new BookService();
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    public List<Book> getBooksByTitle(String title) {
        return bookService.getBooksbyTitle(title);
    }

    public void deleteBook(int id) {
        bookService.deleteBook(id);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        return bookService.updateBook(id, request);
    }

    public Book newBook(CreatBook creatBook) {
        return bookService.newBook(creatBook);
    }
}
