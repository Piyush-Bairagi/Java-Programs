package programs.core;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int position = arr.length - 1;

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[position];
            arr[position] = arr[i];
            arr[i] = temp;
            position--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
