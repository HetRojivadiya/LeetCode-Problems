class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashSet<String> uc = new HashSet<>();
        HashSet<String> cm = new HashSet<>();
        int count = 0;
        String [] s  = (s1 + " " + s2).split(" ");

        for(int i=0;i<s.length;i++)
        {
           if(!cm.contains(s[i]))
           {
            if(!uc.contains(s[i]))
            {
                uc.add(s[i]);
            }else{
                uc.remove(s[i]);
                cm.add(s[i]);
            }
           }
        }

        String result[] = uc.toArray(new String[uc.size()]);
        
        return result;
    }
}