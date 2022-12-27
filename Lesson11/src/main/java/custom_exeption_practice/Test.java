package custom_exeption_practice;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        try {
            System.out.println(findIndex(numbers,1));;
            System.out.println(findIndex(numbers,6));;

        } catch (Khongtimthay k){
            System.out.println(k.getMessage());
        }

    }
    public static int findIndex(int[]arr,int ele){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele){
                return ele;
            }
        }
        throw new Khongtimthay("Không tìm thấy");
    }
}
