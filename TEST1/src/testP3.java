import java.util.Random;

public class testP3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int rdNumber = rd.nextInt();
        System.out.println("Số ngẫu nhiên sinh ra là: " + rdNumber);

        System.out.print("Số trên có phải là số nguyên tố hay không: ");
        System.out.println(isPrimeNumber(rdNumber));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
