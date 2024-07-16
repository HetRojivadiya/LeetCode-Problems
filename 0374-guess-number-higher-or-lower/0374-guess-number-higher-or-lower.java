/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       
        long start=1;
        long end = n;
        
        while(start<=end)
        {
            
            long temp=(start+end)/2;
            
            if(guess((int)temp)==0)
            {
                return (int)temp;
                
            }else if(guess((int)temp)==1)
            {
                start=(int)temp+1;
            }else{
                end=(int)temp-1;
            }
            
        }
        return -1;
    }
}