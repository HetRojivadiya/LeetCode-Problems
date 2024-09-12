class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

     HashSet<Character> hs  = new HashSet<>();

     for(int i=0;i<allowed.length();i++)
     {
        hs.add(allowed.charAt(i));
     }

     int count=0;

     for(int i=0;i<words.length;i++) //o(n)  *  o(k)  = o(n*k)
     {
        boolean flag=false;
        for(int j=0;j<words[i].length();j++) //o(k)
        {
            if(!hs.contains(words[i].charAt(j))) //o(1)
            {
                flag=true;
                break;
            }
        }
       count += (!flag ? 1 : 0);
     }
     return count;
    }
}