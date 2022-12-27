package book_management.backend.repository;

import book_management.backend.Exception.NotFoundException;
import book_management.backend.database.BookDB;
import book_management.backend.model.Book;
import book_management.backend.request.CreatBook;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.utils.FileUtils;

import java.util.List;

public class BookRepository {
    public List<Book> findAll() {
        return BookDB.books;
    }

    public Book findById(int id) {

        for (Book b: BookDB.books){
            if (b.getId() == id){
                return b;
            }
        }
        throw new NotFoundException("Không có quyển sách nào chứa id" + id);
    }

    public void delete(Book book) {
        BookDB.books.remove(book);
        FileUtils.setDataToFile("books.json",BookDB.books);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        Book book = findById(id);
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());

        FileUtils.setDataToFile("books.json", BookDB.books);
        return book;
    }

    public Book newBook(CreatBook creatBook) {
        Book book = new Book();
        book.setId(creatBook.getId());
        book.setTitle(creatBook.getTitle());
        book.setCategories(creatBook.getCategories());
        book.setPageNumber(creatBook.getPageNumber());
        book.setReleaseYear(creatBook.getReleaseYear());
        BookDB.books.add(book);
        FileUtils.setDataToFile("books.json",BookDB.books);
        return book;
    }
}
