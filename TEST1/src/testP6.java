import java.util.Scanner;
import java.util.regex.Pattern;

public class testP6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào email: ");
        String email = sc.nextLine();
        System.out.println("Nhập vào số điện thoại: ");
        String phoneNumber = sc.nextLine();

        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        System.out.println("Email có đúng định dạng không" + ": " + Pattern.matches(EMAIL_PATTERN, email));
    }

}
