package book_management.backend.service;

import book_management.backend.database.BookDB;
import book_management.backend.model.Book;
import book_management.backend.repository.BookRepository;
import book_management.backend.request.CreatBook;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksbyTitle(String title) {
        List<Book> books = bookRepository.findAll();
        List<Book> rs = new ArrayList<>();
        for (Book book: books){
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())){
                rs.add(book);
            }
        }
        return rs;
    }

    public void deleteBook(int id) {
        Book book = bookRepository.findById(id);

        bookRepository.delete(book);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        return bookRepository.updateBook(id, request);
    }

    public Book newBook(CreatBook creatBook) {
        return bookRepository.newBook(creatBook);
    }

    public static void main(String[] args) {
        BookRepository bookRepository1 = new BookRepository();
        bookRepository1.findById(100);
    }
}
