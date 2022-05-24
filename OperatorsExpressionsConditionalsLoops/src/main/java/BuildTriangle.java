import java.util.List;
import java.util.Scanner;

public class BuildTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter angle A: ");
        double angleA = Double.parseDouble(scanner.nextLine());

        System.out.println("Please, enter angle B: ");
        double angleB = Double.parseDouble(scanner.nextLine());

        System.out.println("Please, enter angle C: ");
        double angleC = Double.parseDouble(scanner.nextLine());

        double triangle = angleA + angleB + angleC;
        String triangleType = "";

        // TODO: Think how to refactor for better readability and functionality
        if (triangle == 180 && (angleA > 0 && angleB > 0 && angleC > 0)) {
            // acute = abc < 90  , right- angled = a || b || c == 90) , obtuse a || b || c || > 90,
            //equilateral abc == abc , isosceles if a == b , b == c, a == c , multifaceted abc != abc;
            if (angleA == angleB && angleB == angleC) {
                triangleType = "Equilateral";
            } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                triangleType = "Acute";

            } else if (angleA == angleB || angleB == angleC || angleA == angleC) {
                triangleType = "Isosceles";
            } else if (angleA == 90 || angleB == 90 || angleC == 90) {
                triangleType = "Right-angled";
            } else if (angleA > 90 || angleB > 90 || angleC > 90
                    && ((angleA + angleB) < 90 || (angleA + angleC) < 90 || (angleB + angleC) < 90)) {
                triangleType = "Obtuse";
            } else {
                triangleType = "Multifaceted";
            }

            System.out.println(triangleType + " triangle type is build.");

        } else {
            System.out.println(" Triangle can't be build. Sum of angles should be equal to 180");
            System.out.println("Sum of all angles = " + triangle);
        }
    }
}
