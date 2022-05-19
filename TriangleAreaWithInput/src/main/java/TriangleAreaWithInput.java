import java.util.Scanner;

public class TriangleAreaWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Please, enter Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double area = (width / 2) * height;
        System.out.println("Triangle Area is: " + area);

    }


}
