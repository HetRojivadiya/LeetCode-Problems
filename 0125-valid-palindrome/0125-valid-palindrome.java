class Solution {
    public boolean isPalindrome(String s) {
        
        String str = "";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                str+=s.charAt(i);
            }
        }
        
        String Revstr = "";
        
        for(int i=str.length()-1;i>=0;i--)
        {
            Revstr+=str.charAt(i);
        }
        
        if(str.toUpperCase().equals(Revstr.toUpperCase()))
        {
            return true;
        }else{
            return false;
        }
        
    }
}