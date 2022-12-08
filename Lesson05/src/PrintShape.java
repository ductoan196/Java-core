public class PrintShape {
    public static void main(String[] args) {
        printRectangle(3,4);

        printEmptyRectangle(4,5);
    }
    //IN hình chữ nhật
    public static void printRectangle(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //In hình chữ nhật rỗng
    public static void printEmptyRectangle(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ( i ==0|| i==row-1 || j==0 || j ==col -1){
                    System.out.print("* ");}
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    //In dấu X
    public static void printX(int side){

    }
}
