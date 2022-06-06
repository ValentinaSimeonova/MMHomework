import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        if (isEven(num)) {
            System.out.println("Even number = " + num);
        } else {
            System.out.println("Odd number = " + num);
        }
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }
}
