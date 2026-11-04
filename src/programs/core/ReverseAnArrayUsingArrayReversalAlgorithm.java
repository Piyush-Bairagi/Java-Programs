package programs.core;

import java.util.Arrays;

public class ReverseAnArrayUsingArrayReversalAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println("Array Before Reversing: " + Arrays.toString(arr));

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array After Reversing: " + Arrays.toString(arr));
    }
}
