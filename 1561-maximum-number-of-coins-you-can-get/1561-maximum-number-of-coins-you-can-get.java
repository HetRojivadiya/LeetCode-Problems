class Solution {
    public int maxCoins(int[] piles) {
        
        int Alice = 0;
        int Me = 0;
        int Bob = 0;
        
         Arrays.sort(piles); 
        
        int i=0;
        int j=piles.length -1;
        
        while(i<j){
            if(piles[i]>=piles[j] && piles[i]>=piles[j-1])
           {
               Alice +=piles[i];
               
               if(piles[j]>=piles[j-1])
               {
                   Me += piles[j];
                   Bob += piles[j-1];
               }else{
                   Me += piles[j-1];
                   Bob += piles[j];
               }
           }else if(piles[j]>=piles[i] && piles[j]>=piles[j-1]){
               Alice +=piles[j];
               
               if(piles[i]>=piles[j-1])
               {
                   Me += piles[i];
                   Bob += piles[j-1];
               }else{
                   Me += piles[j-1];
                   Bob += piles[i];
               }
           }else{
               Alice +=piles[j-1];
               
               if(piles[i]>=piles[j])
               {
                   Me += piles[i];
                   Bob += piles[j];
               }else{
                   Me += piles[j];
                   Bob += piles[i];
               }
           }
            i++;
            j-=2;
        }
           
                   
        return Me;
        
    }
}