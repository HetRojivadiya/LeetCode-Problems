class Solution {
    public void rotate(int[] nums, int k) {
     
        k %= nums.length;
        int temp[] = new int[k];
        int x = 0;
        
        for(int i=nums.length-k;i<nums.length;i++)
        {
            temp[x]=nums[i];
            x++;
        }
    
        for(int j=nums.length-1;j>k-1;j--)
        {
            nums[j]=nums[j-k];
        }
        
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
        
        }
        
    
}