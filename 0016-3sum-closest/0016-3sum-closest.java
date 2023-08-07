class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int close=Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i]+nums[j]+nums[k];
                    int min=Math.min(Math.abs(sum-target),Math.abs(close-target));
                    if(min==Math.abs(sum-target))
                    {
                        close= sum;
                    }
                }
            }
        }
            
        return close;
        
    }
}