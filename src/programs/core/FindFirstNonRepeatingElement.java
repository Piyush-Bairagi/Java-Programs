package programs.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,1,4,5,2,7,9,9,0,0,0};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
