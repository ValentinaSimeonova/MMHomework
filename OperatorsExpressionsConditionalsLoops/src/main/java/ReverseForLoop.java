import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseForLoop {
    public static void main(String[] args) {

        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        for(int i = arrayIntegers.size() - 1; i >= 0; i--) {

            System.out.println(arrayIntegers.get(i));
        }
    }
}
