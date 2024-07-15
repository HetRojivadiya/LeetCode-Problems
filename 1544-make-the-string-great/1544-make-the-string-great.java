class Solution {
    public String makeGood(String s) {
        
        while(true)
        {
            String temp="";
            int flag=0;
            for(int i=0;i<s.length();i++)
            {
                if(i<s.length()-1)
                {
                    if((Character.isUpperCase(s.charAt(i)) == Character.isLowerCase(s.charAt(i+1)) ||
                        Character.isUpperCase(s.charAt(i+1)) == Character.isLowerCase(s.charAt(i))) && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(i+1)))
                    {
                        System.out.print("h");
                        
                        flag=1;
                        i=i+1;
                        continue;
                    }
                }
               
                temp+=String.valueOf(s.charAt(i));
            }
            
            System.out.println(temp);
            if(flag==1)
            {
                s=temp;
            }else{
                break;
            }
        }
        return s;
    }
}