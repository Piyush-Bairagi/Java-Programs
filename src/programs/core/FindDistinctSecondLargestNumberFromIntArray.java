package programs.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDistinctSecondLargestNumberFromIntArray {

    public static void main(String[] args) {
        int[] arr = {1,4,2,4,5,3,8,8,7};

        Set<Integer> set = new TreeSet<>();
        for (int item : arr)
            set.add(item);

        int i = 0;
        for (int item : set) {
            if (i == set.size() - 2) {
                System.out.println("Second Largest Distinct Number: " + item);
                break;
            }
            i++;
        }

        // another logic
        List<Integer> list = new ArrayList<>(set);
        System.out.println("Second Largest Distinct Number using ArrayList logic: " + list.get(set.size() - 2));
    }
}
