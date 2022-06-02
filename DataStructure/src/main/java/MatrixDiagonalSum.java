import java.util.Random;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        Random random = new Random();

        // Init matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        // Sum of diagonals
        // leftDiagonal = (0,0) + (1,1) + (2,2) + (3,3)
        // rightDiagonal = (0,3) + (1,2) + (2,1) + (3,0)
        int row = 4;
        int col = 4;
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
                if(i == j) {
                    leftDiagonal += arr[i][j];
                }

                if(j == col - i - 1) {
                    rightDiagonal += arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Results :");
        System.out.println("Left diagonal: " + leftDiagonal);
        System.out.println("Right diagonal: " + rightDiagonal);
    }
}
