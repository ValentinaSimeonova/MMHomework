import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String text, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        text = scanner.nextLine();
        int i = text.length();
        for (int j = i - 1; j >= 0; j--) {
            reverse = reverse + text.charAt(j);
            {

                if (text.equalsIgnoreCase(reverse)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("It's not a palindrome");
                }
            }
        }
    }
}
