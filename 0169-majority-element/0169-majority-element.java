import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxOccurrences = 0;
        int majorityElement = 0;


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxOccurrences) {
                maxOccurrences = count;
                majorityElement = num;
            }
        }

        return majorityElement;
    }
}
