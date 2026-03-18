class Solution {
    public boolean detectCapitalUse(String word) {
        boolean cap = true;
        boolean small = true;
        boolean pascal = true;

        for(int i=0;i<word.length();i++){
            if(cap){
                if(!(word.charAt(i)>='A' && word.charAt(i)<='Z')){
                    cap=false;
                }
            }
            
            if(small){
                if(!(word.charAt(i)>='a' && word.charAt(i)<='z')){
                    small=false;
                }
            }

            if(pascal){
                if(i==0){
                    if(!(word.charAt(i)>='A' && word.charAt(i)<='Z')){
                        pascal= false;
                    }
                }else{
                    if(!(word.charAt(i)>='a' && word.charAt(i)<='z')){
                        pascal=false;
                    }
                }
            }
        }
        return (cap || small || pascal);
    }
}