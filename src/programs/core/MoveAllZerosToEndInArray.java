package programs.core;

import java.util.Arrays;

public class MoveAllZerosToEndInArray {
    public static void main(String[] args) {
        int[] arr = {0,5,0,2,1,3,0,0};

        // move all zeros to right in this array without creating a new array
        System.out.println("Array before moving zeros: " + Arrays.toString(arr));

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
