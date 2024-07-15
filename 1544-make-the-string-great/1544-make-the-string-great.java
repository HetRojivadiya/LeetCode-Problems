class Solution {
    public String makeGood(String s) {
        
//         while(true)
//         {
//             String temp="";
//             int flag=0;
//             for(int i=0;i<s.length();i++)
//             {
//                 if(i<s.length()-1)
//                 {
//                     if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(i+1)))
//                     {
//                         if((Character.isUpperCase(s.charAt(i)) == Character.isLowerCase(s.charAt(i+1)) ||
//                         Character.isUpperCase(s.charAt(i+1)) == Character.isLowerCase(s.charAt(i))))
//                         {       
//                             flag=1;
//                             i=i+1;
//                             continue;
//                         }   
//                     }
//                 }
//                 temp+=String.valueOf(s.charAt(i));
//             }
            
//             System.out.println(temp);
//             if(flag==1)
//             {
//                 s=temp;
//             }else{
//                 break;
//             }
//         }
//         return s;
        
        Stack<Character> stack = new Stack();
        
        stack.push(s.charAt(0));
        int i=1;
        while(i!=s.length())
        {
            if(!stack.isEmpty())
            {
                if(Character.toLowerCase(stack.peek())==Character.toLowerCase(s.charAt(i)) && (Character.isUpperCase(stack.peek()) == Character.isLowerCase(s.charAt(i)) || Character.isUpperCase(s.charAt(i)) == Character.isLowerCase(stack.peek())))
            {
                    System.out.print("h");
                stack.pop();
            }else{
                stack.push(s.charAt(i));
                
            }
                
            }
            else{
                    stack.push(s.charAt(i));
                }
            
            i++;
        }
                   
                   
        StringBuilder str = new StringBuilder();
        
                   while(!stack.isEmpty())
                   {
                       str.append(String.valueOf(stack.pop()));
                   }
                   
                   return str.reverse().toString();
        
        
    }
}