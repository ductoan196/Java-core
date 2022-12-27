package gson_demo;

public class FileJson {
    public static void main(String[] args) {
        //1. ArithmeticException
        try {
            methodOne();
            methodTwo();
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("Lỗi rồi xử lý đi");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Code continue");
    }
    public static void methodOne(){
        int number = 9;
        int zero = 1;
        System.out.println(number/zero);
    }
    public static void methodTwo(){
        String str = null;
        System.out.println(str.length());
    }
}
