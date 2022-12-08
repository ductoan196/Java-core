import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng row: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột col: ");
        int col = sc.nextInt();

        int[][] Array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập giá trị tại vị trí [%d][%d] ", i, j);
                Array[i][j] = sc.nextInt();
            }
        }
        for(int[] subArray: Array){
            for(int number: subArray){
                System.out.println(number);
            }
        }
    }
}