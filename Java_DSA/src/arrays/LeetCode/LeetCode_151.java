package arrays.LeetCode;

class LeetCode_151 {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");

        String out="";

        for (int i=str.length-1;i>0;i--){
            out=out+str[i]+" ";
        }
        return out+str[0];
    }
}
