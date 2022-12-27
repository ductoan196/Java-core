package gson_demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class Student {
        private int id;
        private String name;
        private int age;
        private String email;
    }

