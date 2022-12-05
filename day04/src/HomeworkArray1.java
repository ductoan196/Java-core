import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tên của bạn là : ");
        String name = sc.nextLine();

        String[] list = name.split(" ");

        String fullname = "";
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i].substring(0,1).toUpperCase() + list[i].substring(1);
        }
        System.out.println(String.join(" ", list));
        }

    }

