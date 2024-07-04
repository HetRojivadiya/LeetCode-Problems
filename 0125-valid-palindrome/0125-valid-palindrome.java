class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z'  || s.charAt(i)>='A' && s.charAt(i)<='Z' || 
              s.charAt(i)>='0' && s.charAt(i)<='9' )
            {
                str.append(Character.toUpperCase(s.charAt(i)));
            }
            
        }
    
        
        return str.toString().equals(str.reverse().toString());
        
    }
}