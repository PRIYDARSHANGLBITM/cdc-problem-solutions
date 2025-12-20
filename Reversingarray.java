
public class Reversingarray {

    // Function to reverse array after position m
    public static void reverseArrayAfterM(int[] arr, int m) {
        int start = m + 1;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Sample input (you can modify this)
        int[][] testArrays = {
            {1, 2, 3, 4, 5, 6},
            {10, 9, 8, 7, 6}
        };
        int[] positions = {3, 2}; // M values for each test case

        for (int t = 0; t < testArrays.length; t++) {
            int[] arr = testArrays[t];
            int m = positions[t];
            reverseArrayAfterM(arr, m);

            // Print the output
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
