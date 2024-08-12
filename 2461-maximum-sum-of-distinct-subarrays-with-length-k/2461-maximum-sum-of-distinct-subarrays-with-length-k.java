import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        long maxSum = 0;
        long currentSum = 0;
        
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // Keep removing elements from the left until we can add nums[right]
            while (h.contains(nums[right])) {
                h.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            
            h.add(nums[right]);
            currentSum += nums[right];
            
            // If we have exactly k elements, check if it's the maximum sum
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                
                // Move the window forward by removing the leftmost element
                h.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }
        
        return maxSum;
    }
}
