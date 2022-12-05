import java.util.Random;
import java.util.Scanner;

//import java.util.Scanner;
//
//public class PracticeDemo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int option = 0;
//        boolean isQuit = false;
//
//        while (!isQuit){
//            System.out.println("Nhập vào số bất kỳ: ");
//            option = sc.nextInt();
//
//            switch (option){
//                case 0: {
//                    putAgain();
//                    break;
//                }
//                default:{
//                    System.out.println("Số vừa nhập là " + option);
//                    isQuit = true;
//                    break;
//                }
//            }
//        }
//    }
//    public static void putAgain(){
//        System.out.println("--> Số phải khác 0. Nhập lại!");
//    }
//}
public class PracticeDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        int randomNumber = rd.nextInt(101);

        System.out.print("Số ngẫu nhiên là: ");
        System.out.println(randomNumber);
        int userNumber = 0;

        boolean isQuit = false;
        while(!isQuit){
            System.out.print("Nhập số: ");
            userNumber = sc.nextInt();

            if (userNumber > randomNumber){
                System.out.println("Bạn nhập số lớn hơn rồi, cho nhập lại");
            }
            else if (userNumber < randomNumber){
                System.out.println("Bạn nhập số nhỏ hơn rồi, cho nhập lại");
            }
            else {
                System.out.println("Chúc mừng bạn nhập đúng rồi");
                isQuit = true;
            }
        }
    }
}