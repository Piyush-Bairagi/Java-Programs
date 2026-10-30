package programs.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatingCharacterInArray {
    public static void main(String[] args) {
        int[] arr = {8,7,2,1,4,2,6,9,0,5,7,6};

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
