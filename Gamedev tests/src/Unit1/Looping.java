package Unit1;

public class Looping {
    public static void main(String[] args) {

        int initialValue = 0;
        int finalValue = 10;

        int counter = 0;

        if (initialValue < finalValue) {
            System.out.println("Input accepted!");
            System.out.println("Initial Value: " + initialValue);
            System.out.println("Final Value: " + finalValue);
            System.out.println();
            System.out.println("Initiating count.");
            System.out.println();

            System.out.println(initialValue);
            counter++;

            while (initialValue < finalValue) {
                initialValue++;
                System.out.println(initialValue);
                counter++;

            }

            if (initialValue == finalValue) {
                System.out.println();
                System.out.println("Counting complete.");
                System.out.println("There are " + counter
                        + " numbers (inclusive) between "
                        + (initialValue - counter + 1) + " and " + finalValue
                        + ".");
            }

        } else {
            // Executed if: if (initialValue < finalValue) above is not true.

            System.out.println("Final value is less than initial value!");
            System.out.println("Please choose new values.");
        }

    }
}  // ends Looping Class 