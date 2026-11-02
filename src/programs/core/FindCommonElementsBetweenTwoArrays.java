package programs.core;

import java.util.*;
import java.util.stream.Collectors;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,6,4,7};
        int[] arr2 = {7,3,1};

        Set<Integer> commonElements = new HashSet<>();

        Set<Integer> set = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.toSet());

        for (int item : arr2) {
            if (! set.add(item)) {
                commonElements.add(item);
            }
        }

        System.out.println(commonElements);
    }
}
