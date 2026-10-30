package programs.core;

import java.util.HashMap;
import java.util.Map;

public class FindOccurencesOfEachElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,2,3,4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ":" + entry.getValue());
    }
}
