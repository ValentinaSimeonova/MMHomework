
import java.util.Objects;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        // input Beach or Mountain. -> else No information about this type of vacation.
        // Budget -> per day , per person.  For Beach budget < 50; advise destination Bulgaria.
        // else Outside Bulgaria.
        // Mountain type -> if budget <30 --> Bulgaria. else Outside Bulgaria.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vacation type. Beach or Mountain ?");
        String vacationType = (scanner.nextLine());

        String beach = "Beach";
        String mountain = "Mountain";


        if(Objects.equals(vacationType, beach)){

            System.out.println("Enter budget:");

            double budget = Double.parseDouble(scanner.nextLine());

            if (budget < 50){

                System.out.println("Destination Bulgaria:");
            }
            else {
                System.out.println("Destination outside Bulgaria");
            }
       }
        else if (Objects.equals(vacationType, mountain)){

            System.out.println("Enter budget: ");
            double budget = Double.parseDouble(scanner.nextLine());

            if (budget < 30){
                System.out.println("Destination Bulgaria");
            }
            else {
                System.out.println("Destination outside Bulgaria");
            }

        }
        else {

            System.out.println("No information about this type of vacation.");
        }

    }
}
