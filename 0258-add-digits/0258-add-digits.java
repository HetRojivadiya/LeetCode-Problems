class Solution {
    public int addDigits(int num) {
       
        String n = String.valueOf(num);
        
        
        while(true){
            
            int sum = 0;
        
            for(int i=0;i<n.length();i++)
            {   
                sum += Character.getNumericValue(n.charAt(i));
            }
            
            if(String.valueOf(sum).length()==1)
            {
                return sum;
               
            }else{
                n=String.valueOf(sum);
               
            }
            
        }
        
        
    }
}