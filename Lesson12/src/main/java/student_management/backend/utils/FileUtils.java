package student_management.backend.utils;

import book_management.backend.model.Book;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import student_management.backend.model.Student;

import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FileUtils {
    public static ArrayList<Student> getDataFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // TODO : Đang có vấn đề ở đây - Lỗi khi file trống
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            ArrayList<Student> students = gson.fromJson(reader, type);

            reader.close();
            return students;
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
