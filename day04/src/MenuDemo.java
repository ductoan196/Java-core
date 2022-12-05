import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;
        while (!isQuit){
            showMenu();
            System.out.println("Nhập chức năng: ");
            option = sc.nextInt();
            switch (option){
                case 1: {
                    doOption1();

                }
                case 2: {
                    doOption2();
                    break;
                }
                case 3: {
                    doOption3();
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
            }
        }

    }
    public static void showMenu(){
        System.out.println("/n******* MENU ********"
        );
        System.out.println("1 - Chức năng 1");
        System.out.println("2 - Chức năng 2");
        System.out.println("3 - Chức năng 3");
        System.out.println("4 - Thoát");
    }
    public static void doOption1(){
        System.out.println("Thực hiện chức năng 1");
    }
    public static void doOption2(){
        System.out.println("Thực hiện chức năng 2");
    }public static void doOption3(){
        System.out.println("Thực hiện chức năng 3");
    }
}