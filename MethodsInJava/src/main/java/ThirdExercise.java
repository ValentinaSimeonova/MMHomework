import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter a word");
        String input = scanner.nextLine();
        System.out.println("The middle character/s in the string: " + middle(input));
    }

    public static String middle(String input) {
        int position;
        int length;
        if (input.length() % 2 == 0) {
            position = input.length() / 2 - 1;
            length = 2;
        } else {
            position = input.length() / 2;
            length = 1;
        }
        return input.substring(position, position + length);
    }
}
