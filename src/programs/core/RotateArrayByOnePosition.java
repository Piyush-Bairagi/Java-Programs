 package programs.core;

import java.util.Arrays;

public class RotateArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr = {7,2,9,6,4};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;

        System.out.println("Array after rotation by one position: " + Arrays.toString(arr));
    }
}
