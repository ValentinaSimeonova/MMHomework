public class PineTreeApplication {
    public static void main(String[] args) {
        /*
         Example for tree with height 4:

          |   *
          |  ***
          | *****
          |*******
        */

        int pineTreeHeight = 4;

        // first loop is for pine tree height
        for (int row = 1; row <= pineTreeHeight; row++) {

            // second for loop for print out spaces to match the tree level
            for (int space = 0; space < pineTreeHeight - row; space++) {
                System.out.print(" ");
            }

            // third for loop to print out stars
            for (int star = 0; star < (2 * row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
