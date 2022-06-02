import java.util.ArrayList;
import java.util.Collections;

public class Lecture {
    public static void main(String[] args) {
       /* String[] carBrands = {"Audi", "BMW", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println( "car brands " + carBrands[0]);
        System.out.println( "even numbers " + evenNumbers[2]);
        System.out.println( "degrees "  + degrees[5]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);*/


       /* String[] carModel = {"Audi", "BMW", "Volvo", "Mercedes"};
        carModel[1] = "Trabant";

       /* for (int i = 0; i < carModel.length; i++){
            System.out.println(carModel[i]);
        }/*

        for (String i : carModel ){      // -> for-each loop:
            System.out.println(i);
        }*/

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //cars.set(0, "Volga"); // change element
        //cars.remove(2); // remove element
        //System.out.println(cars);
        //System.out.println(cars.get(0));

        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
