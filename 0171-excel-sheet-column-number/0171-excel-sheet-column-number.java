class Solution {
    public int titleToNumber(String columnTitle) {
        
        Map<Character,Integer> m = new HashMap<>();
        char c = 'A'; 
            
        for(int i=1;i<27;i++)
        {
            m.put(c,i);
            c++;
        }
        
        int sum = 0;
        for(int i=0;i<columnTitle.length();i++)
        {
            sum+=m.get(columnTitle.charAt(i));
            if(i+1<columnTitle.length())
            {
                sum=sum*26;
            }
        }
        
        return sum;
        
    }
}