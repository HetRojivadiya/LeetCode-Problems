class Solution {
    public int maximumLength(String s) {

        int max = s.length()-2;

        for(int i=max;i>0;i--)
        {
            HashMap<String,Integer> hm = new HashMap<>();
        
            for(int j=0;j<s.length()-max+1;j++)
            {
                String str = "";
                boolean flag = true;
                char c = s.charAt(j);

                for(int k=j;k<j+max;k++)
                {
                    if(s.charAt(k)!=c)
                    {
                        flag=false;
                        break;
                    }
                    str+=String.valueOf(s.charAt(k));
                    System.out.print(s.charAt(k));
                }

                if(flag)
                {
                    if(hm.containsKey(str))
                {
                    int temp = hm.get(str);

                   

                    if(temp+1==3)
                    {
                         System.out.print(str);
                        return str.length();
                    }

                    hm.replace(str,temp+1);
                }else{
                    hm.put(str,1);
                }
                System.out.println();

                }
                
                
            }
            max--;
        }
        return -1;
    }
}