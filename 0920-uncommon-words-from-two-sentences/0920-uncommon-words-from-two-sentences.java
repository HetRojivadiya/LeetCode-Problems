class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        int count = 0;

        String [] s_1  = s1.split(" ");
        String [] s_2  = s2.split(" ");

        for(int i=0;i<(s_1.length>s_2.length?s_1.length:s_2.length);i++)
        {
            if(s_1.length>i)
            {
                hm.put(s_1[i],hm.getOrDefault(s_1[i],0)+1);

                if(hm.get(s_1[i])==1)
                {
                    count++;
                }else if(hm.get(s_1[i])==2)
                {
                    count--;
                }

            }

            if(s_2.length>i)
            {
                hm.put(s_2[i],hm.getOrDefault(s_2[i],0)+1);
        
                if(hm.get(s_2[i])==1)
                {
                    count++;
                }else if(hm.get(s_2[i])==2){
                    count--;
                }
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