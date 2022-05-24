import java.util.Scanner;

public class CalculateSaleRevenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        double unitPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        double discount = 0 ;
        int percentDiscount = 0;
        //double totalCost = (unitPrice * quantity);
        double revenue = (unitPrice * quantity);

        if (quantity >= 100 && quantity <= 120){
            discount = revenue * 0.15;
            percentDiscount = 15;
        }
        else if (quantity > 120){
            discount = revenue * 0.20;
            percentDiscount = 20;
        }
        else {
            discount = revenue * 0;
            percentDiscount = 0;
        }
        System.out.println("The revenue from sale: " + (revenue - discount) +"$");
        System.out.println("Discount: " + discount +"$(" + percentDiscount +"% )");



    }
}
