package programs.core;

import java.util.*;

public class FindDuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,2,4,4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
                index++;
            }
        }

        System.out.println(duplicates);
    }
}
