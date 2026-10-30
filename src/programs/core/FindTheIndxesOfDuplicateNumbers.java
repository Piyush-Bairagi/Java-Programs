package programs.core;

import java.util.*;

public class FindTheIndxesOfDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 2, 3};

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int index = 0; index < arr.length; index++) {
            List<Integer> indexes = map.getOrDefault(arr[index], new ArrayList<>());
            indexes.add(index);
            map.put(arr[index], indexes);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1)
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
