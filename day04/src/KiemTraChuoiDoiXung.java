import java.util.Scanner;

public class KiemTraChuoiDoiXung {
//    public static boolean Test(int number) {
//        if (number < 2) {
//            return false;
//        }
//
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Nhập số kiểm tra: ");
//            int number = sc.nextInt();
//        }
//    }
    public static boolean Test(int number){
        if (number >2){
            return false;
        }
        for (int i = 2; i < (number -1) ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}