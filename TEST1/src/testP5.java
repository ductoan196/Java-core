import java.util.Scanner;

public class testP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số hàng: ");
        int row = sc.nextInt();

        System.out.print("Nhập vào số cột: ");
        int col = sc.nextInt();

        int[][] ArrayD2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập vào phần tử index thứ [%d][%d]: ", i, j);
                ArrayD2[i][j] = sc.nextInt();
            }
        }
        //In mảng ra màn hình
        System.out.println("Mảng được tạo ra là: ");
        for(int[]subArray: ArrayD2){
            for(int number: subArray){
                System.out.print(number);
            }
            System.out.println();
        }
        //Liệt kê các phần tử nằm trên đường chéo chính
        System.out.println("Các phần tử nằm trên đuường chéo chính là: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j ) {
                    System.out.print(ArrayD2[i][j] + " ");
                }
            }
        }

        System.out.println();
        // Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
        int[][] newArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập vào phần tử index thứ [%d][%d] của chuỗi mới: ", i, j);
                newArray[i][j] = sc.nextInt();
            }
        }

        int[][] total = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                total[i][j] = ArrayD2[i][j] + newArray[i][j];
                }
            }
        System.out.println("Chuỗi sinh ra từ tổng hai chuỗi là: ");
        for (int[] subTobal : total){
            for (int subNumber: subTobal){
                System.out.print(subNumber);
            }
            System.out.println();
        }

    }
}
