class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
            {
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        Set<Integer> keys=m.keySet();
        int max = 0;
        int keyValue = 0;
        for (Integer key : keys){
            if(m.get(key)>max)
            {
                max = m.get(key);
                keyValue = key;
                
            }
        }
        
        return keyValue;
        
    }
}