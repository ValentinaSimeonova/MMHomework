import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleBy5 {
    public static void main(String[] args) {
        List<Integer> divisableByFive = new ArrayList<>();
        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200));
        for (int i = 0; i < arrayIntegers.size(); i++) {
            int current = arrayIntegers.get(i);

            if(current > 150) {
                break;
            }

            if(current % 5 == 0) {
                divisableByFive.add(current);
                System.out.println(current);
            }
        }
    }
}
