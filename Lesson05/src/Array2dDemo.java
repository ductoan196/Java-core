import java.util.Arrays;
import java.util.Scanner;

public class Array2dDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        int [][] numberOther ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < numberOther.length; i++) {
            System.out.println(Arrays.toString(numberOther[i]));

            for (int j = 0; j < numberOther[i].length; j++) {
                System.out.println(numberOther[i][j]);
            }
        }
        System.out.println("Sử dụng foreach: ");
        for (int [] row : numberOther){
            for (int number: row){
                System.out.println(number);
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số hàng: ");
        int row = sc.nextInt();

        System.out.println("Nhập vào số cột ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

            }
        }

        int [][] array = new int[row][col];

        // In ra mảng ở dạng ma trận
        for (int[] subArrray : array){
            for (int number: subArrray){
                System.out.println(number + " ");
            }
            System.out.println();
        }

    }
}
