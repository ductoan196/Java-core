import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String message = "Tôi là toàn";
        int n = message.length();
        String intArr [] = message.split(" ");
        System.out.println(Arrays.toString(intArr));
        System.out.println(String.join(" ", intArr));
    }
}