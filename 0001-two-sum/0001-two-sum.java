class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int key = target-nums[i];
            if(m.containsKey(key))
            {
                return new int[]{m.get(key),i};
            }
            else{
                m.put(nums[i],i);
            }
        }
        
        return new int[]{0,1};

    }
}