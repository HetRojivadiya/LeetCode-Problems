import java.util.*; 
class Solution {
    public int removeDuplicates(int[] nums) {
        
        Map<Integer,Integer> m = new LinkedHashMap<>();
        
        for(int n : nums)
        {
            if(m.containsKey(n))
            {
                int temp = m.get(n);
                m.replace(n,temp+1);
            }else{
                m.put(n,1);
            }
        }
        
        int index=0;
        
        for(Map.Entry<Integer,Integer> n : m.entrySet())
        {
            if(n.getValue()>=2)
            {
                
                nums[index]=n.getKey();
                index++;
                nums[index]=n.getKey();
                index++;
                
            }else{
                nums[index]=n.getKey();
                index++;
                
            }
        }
        
      
        return index;
        
            
        
    }
}