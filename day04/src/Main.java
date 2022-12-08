import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đưa vào: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng muốn nhân bản: ");
        int n = sc.nextInt();
        String strArr [] = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = name;
        }
        System.out.println("Nhân chuỗi lên 10 lần: ");
        System.out.println(String.join("", strArr));
        System.out.println("Nhân chuỗi lên 10 lần cách nhau bởi dấu - : ");
//        for (int i = 0; i < n; i++) {
//            strArr[i] += "-";
//            if(i==0){
//                strArr[i]+= "";
//            }
//        }
        System.out.println(String.join("-", strArr));
    }
}