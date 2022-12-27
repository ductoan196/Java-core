package exception_demo;

public class UncheckExceptionDemo {
    public static void main(String[] args) {

        //1. ArithmeticException
        int number = 9;
        int zero = 0;
        int result = number/zero;

    //NullPointerException
        String str = null;
        System.out.println(str.length());
    }

//    //NumberFormatException
//    String str = "Chuỗi";
//    int number = Integer.parseInt(str);

    //ArrayIndexOutOfBoundsException
//
}
