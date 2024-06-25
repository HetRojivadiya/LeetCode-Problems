class Solution {
    public int titleToNumber(String columnTitle) {
        
        int sum = 0;
        for(int i=0;i<columnTitle.length();i++)
        {
            sum+=(int)columnTitle.charAt(i)-64;
            if(i+1<columnTitle.length())
            {
                sum=sum*26;
            }
        }
        return sum;
        
    }
}