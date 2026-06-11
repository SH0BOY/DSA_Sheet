class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char i : s.toCharArray()){
            int len =sb.length();
            if(len > 0 && sb.charAt(len-1)==i){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(i);
            }
        }

        return sb.toString();
    }
}