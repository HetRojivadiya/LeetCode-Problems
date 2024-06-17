class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> m = new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
            {
                int value= m.get(nums[i]);
                m.replace(nums[i],value+1);
            }else{
                m.put(nums[i],1);
            }
        }
        
     
       List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(m.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue()); 
        
       
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }
        
        return result;
       
    }
}