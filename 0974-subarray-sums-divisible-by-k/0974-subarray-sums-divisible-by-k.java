class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
         int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle the case where sum-k=0

        for (int num : nums) {
            sum += num;
            int mod = sum % k;
            if (mod < 0) mod += k; // To handle negative remainder
            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
        
    }
}