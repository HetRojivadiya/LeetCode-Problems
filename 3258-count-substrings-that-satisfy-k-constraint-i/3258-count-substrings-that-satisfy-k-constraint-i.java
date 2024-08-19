class Solution {
    public int countKConstraintSubstrings(String s, int x) {
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                int co = 0;
                int cz = 0;
                boolean flag=false;
                String temp = "";
                for(int k=i;k<=j;k++)
                {
                   temp+=String.valueOf(s.charAt(k));
                    if(s.charAt(k)=='0')
                    {
                        cz++;
                    }else if(s.charAt(k)=='1')
                    {
                        co++;
                    }
                    
                    if(cz>x && co>x)
                    {
                        flag=true;
                        // System.out.println(temp);
                    }
                }
                //System.out.println();
                
                if(flag==false)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}