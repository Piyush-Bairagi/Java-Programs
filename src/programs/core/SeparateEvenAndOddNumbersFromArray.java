package programs.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateEvenAndOddNumbersFromArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,6,4,6,3,1,0,7};

        // Convert array to set
        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();

        for (int item : set) {
            if (item % 2 == 0) {
                even.add(item);
            } else {
                odd.add(item);
            }
        }

        System.out.println("Even: " + even.toString());
        System.out.println("Odd: " + odd.toString());
    }
}
