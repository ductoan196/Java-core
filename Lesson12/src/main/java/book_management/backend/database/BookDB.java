package book_management.backend.database;

import book_management.backend.Utils.FileUtils;
import book_management.backend.model.Book;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BookDB {
    public static List<Book> books = FileUtils.getListObjectFromJsonFile("book.json");
}
