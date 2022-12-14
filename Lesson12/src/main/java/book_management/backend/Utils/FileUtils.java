package book_management.backend.Utils;

import book_management.backend.model.Book;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
    // 2. Lấy List object từ file json
    ///Sửa lại thành ArrayList để fix lỗi
    public static ArrayList<Book> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            //TODO: Đang có vấn đề ở đây, lỗi khi file trống

            Type type = new TypeToken<ArrayList<Book>>(){}.getType();

            ArrayList<Book> userArray = gson.fromJson(reader, type);

            reader.close();
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    public static void convertObjectToJsonFile(String fileName, List<Book> obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
