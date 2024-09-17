class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        int count = 0;

        String [] s  = (s1 + " " + s2).split(" ");
       

        for(int i=0;i<s.length;i++)
        {
            hm.put(s[i],hm.getOrDefault(s[i],0)+1);

            if(hm.get(s[i])==1)
            {
                count++;
            }else if(hm.get(s[i])==2)
            {
                count--;
            }
        }


        String result[] = new String[count];
        int index = 0;
        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==1)
            {
                result[index] = entry.getKey();
                index++;
            }
        }
        
        return result;
    }
}