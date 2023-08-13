class Solution {
    public List<String> simplifiedFractions(int n) {
        
        List<String> l = new ArrayList<>();
        int i = 1;
        while(true){
            
            for(int j=2;j<=n;j++)
            {
                if(i%j!=0)
                {
                    if(i==1)
                    {
                        l.add(i+"/"+j);
                    }
                    else if(gcd(i,j)==1)
                    {
                        if(i<j){
                        l.add(i+"/"+j);
                        }
                    }
                     
                }
            }
            i++;
            if(i>=n)
            {
                break;
            }
        }
        return l;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}