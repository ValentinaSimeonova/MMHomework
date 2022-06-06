import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        System.out.println("Number of words: " + wordCount(input));
    }

    public static int wordCount(String input) {
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }


}
