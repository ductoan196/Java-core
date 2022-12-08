import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        //Cách 1: Khai báo thông thường
//        int number [] = new int [3];
//        number[0]= 0;
//        number[1]=1;
//        number[2] =2;
//        System.out.println(Arrays.toString(number));
//
//        //Cách 2: Khai báo trực tiếp
//        int [] numbers = {1,2,3};
//        numbers [0] = 10;
//        System.out.println(Arrays.toString(numbers));
//
//        //Reference Type
//        String [] emails = {"a@gmail.com", "b@gmail.com", "c@gmail.com"};
//        String [] emailsOther = emails;// Gán địa chỉ ô nhớ
//
//        System.out.println(Arrays.toString(emails));
//        System.out.println(Arrays.toString(emailsOther));
//
//        emailsOther[0] = "d@gmail.com";
//        System.out.println("After: " + Arrays.toString(emails));
//        System.out.println("After: " + Arrays.toString(emailsOther));
//
//        for (int i = 0; i < number.length -1; i++) {
//            System.out.println(number[i]);
//        }
//        int i=0;
//        while (i< number.length){
//            System.out.println(numbers[i++]);
//        }
//        // Về làm trường hợp viết hoa chuỗi "  một Ngày   nÀo đÓ "
//        //Trường hợp này phải loại bỏ khoảng trống đầu và cuối chuỗi (trim), nếu có nhiều khoảng trống giữa các từ thì chỉ để lại 1 khoảng trống

        int numberList[] = {1,2,3};
        System.out.println(listNumber1(numberList));

        System.out.println(listChar("a"));

        System.out.println(listChar1("a"));

        int listArr [] = {1,2,3};
        System.out.println(checkElementExist(listArr, 1));
    }

    //Bài 1
        public static String listNumber1(int[] numberList){
            int [] number = new int[numberList.length];
            for (int i = 0; i < numberList.length; i++) {
                 number[i]=numberList[i] % 2;
            }
            String numberString = Arrays.toString(number);
            return numberString;
    }

    //Bài 2
    public static String listChar(String char1){
        String messageArr[] = new String[10];
        for (int i = 0; i < messageArr.length; i++) {
            messageArr[i]=char1;
        }
        String messageString = String.join("", messageArr);
        return messageString;
    }
    //Bài 3
    public static String listChar1(String char1){
        String messageArr[] = new String[10];
        for (int i = 0; i < messageArr.length; i++) {
            messageArr[i]=char1;
        }
        String messageString = String.join("-", messageArr);
        return messageString;
    }
    //Bài 4
    public static boolean checkElementExist(int listArr1[] , int Element1){
        for (int i = 0; i < listArr1.length ; i++) {
            if(listArr1[i] == Element1){
                return true;
            }
        }
        return false;

    }
    //Bài 5
//    public static String randomHexCode(){
//        String listChoose = "1 2 3 4 5 6 7 8 9 a b c d e f";
//        String listChoose1[] = listChoose.split(" ");
//        String randomHex[] = new String[6];
//        for (int i = 0; i < listChoose1.length; i++) {
//            for (int j = 0; j < 6; j++) {
//                randomHex [j] = listChoose1[i]
//            }
//        }
//    }
}
