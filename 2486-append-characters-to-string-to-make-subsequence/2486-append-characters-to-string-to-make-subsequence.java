class Solution {
    public int appendCharacters(String s, String t) {
        
        
        int index=0;
        int require=t.length();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==t.charAt(index))
            {
                require--;
                index++;
            }
            if(index>t.length()-1)
            {
                break;
            }
                
        }
        return require;
    }
}