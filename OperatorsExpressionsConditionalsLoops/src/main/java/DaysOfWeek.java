import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week");

        int dayCount = Integer.parseInt(scanner.nextLine());
        String daySuffix = "th";
        String weekDay = "";
        switch (dayCount) {
            case 1:
               daySuffix = "st";
               weekDay = "Monday";
                break;
            case 2:
                daySuffix = "nd";
                weekDay = "Tuesday";
                break;
            case 3:
                daySuffix = "rd";
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                System.out.println("This is not a valid day of the week.");


        }
        if (dayCount >= 1 && dayCount < 8) {

            System.out.format("The %d-%s day of the week is %s.",dayCount,daySuffix,weekDay);
        }




    }
}
