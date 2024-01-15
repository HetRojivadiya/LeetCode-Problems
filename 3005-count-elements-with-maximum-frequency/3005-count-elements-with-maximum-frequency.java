class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer,Integer> m = new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i], 0) + 1);   
        }
        
        
        int max = 0;
        int c = 1;
         for (int frequency : m.values()) {
             
             if(frequency==max)
             {
                 c++;
             }else if(frequency>max)
             {
                 c=1;
                 max= frequency;
             }
             
            
        }
        return max*c;
        
    }
}