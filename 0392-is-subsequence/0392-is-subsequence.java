class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0;
        
        if(s.equals(""))
        {
            return true;
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(index == s.length()-1 && t.charAt(i)==s.charAt(index))
            {
                return true;
            }
            
            if(s.charAt(index)==t.charAt(i))
            {
                index++;
            }
        }
        return false;
        
    }
}