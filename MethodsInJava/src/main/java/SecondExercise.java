import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second num: ");
        double second = scanner.nextDouble();
        System.out.println("Enter third num: ");
        double third = scanner.nextDouble();
        System.out.println("Compute the average of three numbers: " + computeAverageOfThreeNumbers(first, second, third));
    }

    static double computeAverageOfThreeNumbers(double first, double second, double third) {
        return (first + second + third) / 3;
    }
}
