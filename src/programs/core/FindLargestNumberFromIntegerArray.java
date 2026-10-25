package programs.core;

import java.util.Arrays;

public class FindLargestNumberFromIntegerArray {

    public static void main(String[] args) {
        int[] arr = {40, 16, 8, 25, 0, 35};
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Largest number: " + largestNumber);
    }
}