import java.sql.SQLOutput;
import java.util.Scanner;

public class SixtExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindrome(number);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int number) {
        String numberText = String.valueOf(number);


        String result = "";
        for (int i = numberText.length() - 1; i >= 0; i--) {
            result += numberText.charAt(i);
        }

        return result.equals(numberText);
    }
}
