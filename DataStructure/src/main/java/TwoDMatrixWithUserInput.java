import java.util.Random;
import java.util.Scanner;

public class TwoDMatrixWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter numbers of row:");
        rows = scanner.nextInt();

        System.out.println("Enter numbers of cols:");
        cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols]; // row columns

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
