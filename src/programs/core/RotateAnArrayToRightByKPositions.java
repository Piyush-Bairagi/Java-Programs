package programs.core;

import java.util.Arrays;

public class RotateAnArrayToRightByKPositions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Array Before Rotation: " + Arrays.toString(arr) + " And k is: " + k);

        int[] tempArray = new int[k];
        int index = arr.length - k;
        for (int i = 0; i < k; i++) {
            tempArray[i] = arr[index];
            index++;
        }

        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = tempArray[i];
        }
        System.out.println("Array After Rotation: " + Arrays.toString(arr));
    }
}
