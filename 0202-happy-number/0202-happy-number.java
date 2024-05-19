class Solution {
    public boolean isHappy(int n) {
        
          int iteration = 10;  // Optional limit to prevent infinite loops in testing
      
        
        while (n != 1 ) {
            
            n = getSumOfSquares(n);
            iteration--;
            if (iteration == 0) {
                break;  // Optional, can be removed to allow full determination of happy number
            }
        }
        
        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
        
    
}