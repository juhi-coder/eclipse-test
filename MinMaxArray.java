public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Initialize min and max to the first element of the array
        int min = array[0];
        int max = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Output the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
