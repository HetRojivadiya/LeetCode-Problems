
import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        
        int arr[] = new int[heights.length];
        arr = heights.clone();
        
        int total=0;
        
        Arrays.sort(heights);
        
        for(int i=0;i<heights.length;i++)
        {
            if(arr[i]!=heights[i])
            {
                total++;
            }
        }
        
        return total;
        
    }
}