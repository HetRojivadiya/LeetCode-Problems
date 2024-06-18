class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        for(int i=0;i<profit.length;i++)
        {
            for(int j=0;j<profit.length-i-1;j++)
            {
                if(profit[j]<profit[j+1])
                {
                    int temp = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = temp;
                    
                    int temp1 = difficulty[j];
                    difficulty[j] = difficulty[j+1];
                    difficulty[j+1]= temp1;
                }
            }
        }
        
        
        
        int total = 0;
        for(int i=0;i<worker.length;i++)
        {
            for(int j=0;j<profit.length;j++)
            {
                if(difficulty[j]<=worker[i])
                {
                    total+=profit[j];
                    break;
                }
            }
        }
        
        return total;
        
    }
}