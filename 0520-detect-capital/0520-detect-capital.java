class Solution {
    public boolean detectCapitalUse(String word) {

        boolean cap = true;
        boolean small = true;
        boolean pascal = true;

        for(int i=0;i<word.length();i++){
            if(cap){
                if(!isCapital(word.charAt(i))){
                    cap=false;
                }
            }
            
            if(small){
                if(!isSmall(word.charAt(i))){
                    small=false;
                }
            }

            if(pascal && !small){
                if(i==0){
                    if(!isCapital(word.charAt(i))){
                        pascal= false;
                    }
                }else{
                    if(!isSmall(word.charAt(i))){
                        pascal=false;
                    }
                }
            }
        }
        return (cap || small || pascal);
    }

    private boolean isCapital(char c){
        return c >= 'A' && c <= 'Z';
    }

    private boolean isSmall(char c){
        return c >= 'a' && c <= 'z';
    }
}