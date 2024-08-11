class Solution {
    public String modifyString(String s) {
        
        if(s.length()==1)
        {
            if(s.charAt(0)=='?')
            {
                return "a";
            }else{
                return s;
            }
        }

        char c[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String result="";

        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='?')
            {
                if(j!=0 && j!=s.length()-1)
                {
                    for(int i=0;i<26;i++)
                    {
                        if(c[i]!=result.charAt(j-1) && c[i]!=s.charAt(j+1))
                        {
                            result+=String.valueOf(c[i]);
                            break;
                        }
                    }
                }else if(j==0){
                    for(int i=0;i<26;i++)
                    {
                        if(c[i]!=s.charAt(j+1))
                        {
                            result+=String.valueOf(c[i]);
                            break;
                        }
                    }
                }else if(j==s.length()-1)
                {
                    for(int i=0;i<26;i++)
                    {
                        if(c[i]!=result.charAt(j-1))
                        {
                            result+=String.valueOf(c[i]);
                            break;
                        }
                    }
                }
            }else{
                result+=String.valueOf(s.charAt(j));
            }
        }
        return result;
        
    }
}