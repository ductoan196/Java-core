public class PracticeArr {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15}; //target: 9
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == 9){
                    System.out.printf("[%d,%d]", i,j);
                }
            }
        }
    }
}
