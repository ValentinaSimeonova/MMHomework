public class FirstExercise {
    public static void main(String[] args) {
        FirstExercise smallestNumber = new FirstExercise();
        smallestNumber.findSmallestNumber(8, 12, -25);
        smallestNumber.findSmallestNumber(1, 18, 4);
        smallestNumber.findSmallestNumber(-55, 64, 2);
        smallestNumber.findSmallestNumber(333, 12, 0);
        smallestNumber.findSmallestNumber(1, 1, 1);
    }

    public void findSmallestNumber(int first, int second, int third) {
        int smallest = 0;
        if (first <= second && first <= third) {
            smallest = first;
            System.out.println(smallest);
        } else if (second <= first && second <= third) {
            System.out.println(smallest);
        } else {
            smallest = third;
            System.out.println(smallest);
        }
    }
}

