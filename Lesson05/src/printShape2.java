public class printShape2 {
    public static void main(String[] args) {
        printRectangle(5, 6);
        System.out.println();
        printX(5);
        System.out.println();
        printHalfRectangle(5);
    }

    // IN ra hình chữ nhật rỗng
    public static void printRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // IN ra chữ X
    public static void printX(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == j || i + j == side - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printHalfRectangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i - j >=0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
