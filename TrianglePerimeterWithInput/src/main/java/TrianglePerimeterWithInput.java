import java.util.Scanner;

public class TrianglePerimeterWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first side : ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter second side : ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter third side : ");
        int c = Integer.parseInt(scanner.nextLine());

        int perimeter = a + b + c;
        System.out.println("Triangle perimeter is : " + perimeter);
    }
}
