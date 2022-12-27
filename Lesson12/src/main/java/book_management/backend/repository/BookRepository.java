package book_management.backend.repository;

import book_management.backend.Utils.FileUtils;
import book_management.backend.database.BookDB;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.UpdateBookRequest;

import java.util.List;

public class BookRepository {
    public List<Book> findAll() {
        return BookDB.books;
    }

    public Book findById(int id){
        for (Book b: BookDB.books){
            if(b.getId() == id){
                return b;
            }
        }
        throw  new NotFoundException("Khng tìm thấy quyển sách có id =" + id);
    }
    public void delete(Book book){
        BookDB.books.remove(book);
        FileUtils.convertObjectToJsonFile("book.json", BookDB.books);
    }

    public Book update(int id, UpdateBookRequest request) {
        Book book = findById(id);
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());

        FileUtils.convertObjectToJsonFile("book.json", BookDB.books);
        return book;
    }

    public void save(Book book) {
        BookDB.books.add(book);
        FileUtils.convertObjectToJsonFile("book.json", BookDB.books);
    }
}
