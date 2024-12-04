class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {

        int index=0;

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==str2.charAt(index) || str1.charAt(i)=='z' && str2.charAt(index)=='a' || (int)str1.charAt(i)+1==str2.charAt(index))
            {
                index++;
            }

            if(index==str2.length())
            {
                return true;
            }
        }

        return false;
        
    }
}