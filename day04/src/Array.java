public class Array {
    public static void main(String[] args) {
        int [] intArray;
        intArray = new int[5];
        intArray[0] = 1;
        intArray [1] = 2;

        System.out.println(intArray[1]);

        float[] floatArray = new float[3];
        String[] strArray = {"Tôi", "Là", "Đức", "Toàn"};
        int i = 0;
        while (i < strArray.length){
            System.out.println(strArray[i]);
            i++;
        }

        double [] doubleArray = {1.1, 2.2, 3.3, 4.4};
        for (double number : doubleArray) {
            System.out.println(number);
        }

        // Khai báo mảng number1:
        int sum = 0;
        int [] newIntArr = {1,2 ,3,4};

        //Duyệt qua các mảng newIntArr
        for (int number1 : newIntArr){
            sum += number1;
        }
        System.out.println(sum);


        // Khai báo mảng numbers
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum1 = 0;

// Duyệt qua các mảng numbers để tính tổng
        for (int number: numbers) {
            sum1 += number;
        }

        System.out.println("Sum = " + sum1);
    }
}
