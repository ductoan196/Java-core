import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số phần tử trong chuỗi là: ");
        int n = sc.nextInt();

        int list [] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Giá trị index thứ " + i + " là : ");
            list[i] = sc.nextInt();
        }
        boolean isQuit = false;

        while (!isQuit){
            showMenu();
            System.out.println("Nhập tính năng muốn sử dụng: ");
            int option = sc.nextInt();

            switch (option){
                case 1: {
                    System.out.println(Arrays.toString(list));
                    break;
                }
                case 2: {
                    for (int i = 0; i < n; i++) {
                        if (list[i] % 2 == 0){
                            list[i]++;
                        }
                    }
                    System.out.println(Arrays.toString(list));
                    break;
                }
                case 3: {
                    isQuit = true;
                    break;
                }
            }
        }

    }
    public static void showMenu(){
        System.out.println("\n********* MENU *********");
        System.out.println("1 - In ra chuỗi");
        System.out.println("2 - Tăng mỗi số chẵn trong chuỗi lên 1 phần tử: ");
        System.out.println("3 - Thoát\n");
    }
}
