import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number: ");
        int num2 = scanner.nextInt();
        int result = divideTwoNumbers(num1,num2);
        System.out.println(result);
    }
    public static int divideTwoNumbers (int num1, int num2){
        int result = 0;
        try {
            result = num1/num2;
        } catch (ArithmeticException ex) {
            System.out.println("Divide by zero not allowed");
        }
        return result;
    }

}
