import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<String>();
        color.add("blue");
        color.add("red");
        color.add("yellow");
        color.add("green");
        color.add("pink");
        for (int i = 4; i >= 0; i--) {

            System.out.println(color.get(i));

        }


    }
}
