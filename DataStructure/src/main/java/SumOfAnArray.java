public class SumOfAnArray {
    public static void main(String[] args) {
        double[] numbers = {10, 15, 2.5, 8, 26.5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
