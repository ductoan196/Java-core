public class testP4 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("10 số nguyên tố đầu tiên là: ");
        while (count < 10) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
        //Liệt kê các số nhỏ hơn 10
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int i = 0; i < 10; i+=1) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " " );
            }
        }
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
