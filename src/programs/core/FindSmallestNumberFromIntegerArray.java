package programs.core;

import java.util.*;

public class FindSmallestNumberFromIntegerArray {

    public static void main(String[] args) {

        int[] arr = {34, 7, 8, 23, 34};
        int smallestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNumber)
                smallestNumber = arr[i];
        }

        System.out.println("Smallest number: " + smallestNumber);

        // another logic
        Set<Integer> set = new TreeSet<>();
        for (int num : arr)
            set.add(num);

        List<Integer> list = new ArrayList<>(set);
        System.out.println("Smallest Number using ArrayList and TreeSet: " + list.get(0));
    }
}
