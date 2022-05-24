import java.util.Scanner;

public class UserAgeWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your age.");
        int age = Integer.parseInt(scanner.nextLine());

        if (age > 0 && age < 16){

            System.out.println("You are ineligible to work.");
        }
        else if (age >= 16 && age <= 110){

            System.out.println("You are eligible to work.");
        }
        else {
           System.out.println("Invalid age!");
        }

    }
}
