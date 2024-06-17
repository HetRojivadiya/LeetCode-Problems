class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int result[] = new int[nums.length]; 
        
        int multi=1;
        int flag=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                multi*=nums[i];
            }else{
                flag++;
            }
        }
        
        if(flag>=2)
        {
            for(int i=0;i<nums.length;i++)
            {
                result[i]=0;
            }
        }else if(flag==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    result[i]=multi;
                }else{
                    result[i]=0;
                }
            }
        }else{
            for(int i=0;i<nums.length;i++)
            {
                result[i]=multi/nums[i];
            }
        }
        
       
        return result;
        
    }
}