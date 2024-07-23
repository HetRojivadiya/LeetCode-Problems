class Solution {
    public int climbStairs(int n) {
        
        int count=0;
        int a=1;
        int b=2;
        for(int i=0;i<n;i++)
        {
            count++;
            System.out.print(a);
            if(count==n)
                break;
            int c = b;
            b +=a;
            a = c;
        }
        return a;
    }
}