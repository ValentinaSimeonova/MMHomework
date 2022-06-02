import java.util.Scanner;

public class TheBiggestElementInArray {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 18, 58, 12};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is: " + max);


    }
}
