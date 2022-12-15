package classDemo;

public class Calculator {
    int number1;
    int number2;
    public void printInfo(){
        System.out.println(number1 + " " + number2);
    }
    public int addition(){
        return number1+ number2;
    }
    public int subtract(){
        return number1 - number2;
    }
    public int multi(){
        return number1 * number2;
    }
    public int division(){
        if (number2 ==0){
            System.out.println("Không thể trả về giá trị");
        }
        return (int)(number1/number2);
    }


}

