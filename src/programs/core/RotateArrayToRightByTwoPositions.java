package programs.core;

import java.util.Arrays;

public class RotateArrayToRightByTwoPositions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array before rotation: " + Arrays.toString(arr));

        int[] tempArray = new int[2];
        tempArray[0] = arr[arr.length - 2];
        tempArray[1] = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 2];
        }

        arr[0] = tempArray[0];
        arr[1] = tempArray[1];

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
