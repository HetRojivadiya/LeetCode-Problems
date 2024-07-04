class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> m = new HashMap<>();
        
        for(char c : magazine.toCharArray())
        {
            if(m.containsKey(c))
            {
                int temp = m.get(c);
                m.replace(c,temp+1);
            }else{
                m.put(c,1);
            }
            
        }
        
        for(char c : ransomNote.toCharArray())
        {
            if(m.containsKey(c))
            {
                 int temp = m.get(c);
                if(temp==1)
                {
                    m.remove(c);
                }else{
                    m.replace(c,temp-1);
                }
                
            }else{
                return false;
            }
        }
        
        return true;
        
    }
}