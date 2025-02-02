import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // To handle cases where k > n

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first part (from 0 to k-1)
        reverse(arr, 0, k - 1);

        // Reverse the second part (from k to n-1)
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;  // Number of positions to rotate

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateArray(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}