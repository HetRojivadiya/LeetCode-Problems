class Solution {
    public int subsetXORSum(int[] nums) {
        
        int n = nums.length;
        int sum=0;
        
        for(int i=0;i<(1<<n);i++)
        {
            int tempSum []=new int[n];
            int k=0;
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))!=0)
                {
                    tempSum[k] = nums[j];
                    k++;
                }
            }
            int temp=0;
            for(int x=0;x<k;x++)
            {
                if(x==0)
                {
                    temp=tempSum[0];
                }
                else{
                    temp^=tempSum[x];
                }
                
            }
            sum+=temp;
        }
        return sum;
        
    }
}