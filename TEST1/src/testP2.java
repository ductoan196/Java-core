public class testP2 {
    public static void main(String[] args) {

        countMess("Toi la Toan");
    }
    public static void countMess(String message){
        System.out.println("Số từ trong chuỗi là: "+ message.length());

        int countO = 0;
        char ch = 'o';
        char [] charArr = message.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ch){
                countO +=1;
                System.out.println("Ký tự O trong chuỗi thứ " + i);
            }
        }
        System.out.println("Số ký tự O trong chuỗi là: " + countO);
    }
}
