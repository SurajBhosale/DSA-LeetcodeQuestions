package Arrays;

import java.util.Arrays;

public class ReverseArrayByK {

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        reverseNum(arr, 0, k - 1);
        reverseNum(arr, k, n - 1);
        reverseNum(arr, 0, n - 1);

        return arr;

    }

    static void reverseNum(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 7, 5, 2, 11, 2, 43, 1, 1 };
        int k = 2;
        int[] ans = rotateArray(arr, k);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Rotated Array by k places " + Arrays.toString(ans));
    }
}
