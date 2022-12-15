package book_management.service;

import book_management.model.Book;
import book_management.repository.BookRepository;

public class BookService {
    BookRepository bookRepository = new BookRepository();

    public void findByTitle(String title){
        int count = 0;
        for(Book book: bookRepository.findAll()){
            if (book.title.toLowerCase().contains(title.toLowerCase())){
                System.out.println(book);
                count++;
            }
        }
        if (count==0){
            System.out.println("Không có quyển sách nào có title: " + title);
        }
    }
    public void findByCategory(String category){
        int count1 = 0;
        for(Book book: bookRepository.findAll()){
            if (book.category.toLowerCase().equals(category.toLowerCase())){
                System.out.println(book);
                count1++;
            }
        }
        if (count1==0){
            System.out.println("Không có quyển sách nào thuộc thể loại: " + category);
        }
    }
    public void findByPublishYear(){
        int count2 = 0;
        for(Book book: bookRepository.findAll()){
            if (book.year == 2022){
                System.out.println(book);
                count2++;
            }
        }
        if (count2==0){
            System.out.println("Không có quyển sách nào xuất bản vào năm nay");
        }
    }
}
