class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(String i : words){
            int sum=0;
            for(char j : i.toCharArray() ){
                sum+=weights[j-'a'];
            }
            int mod =sum%26;
            sb.append((char)('z'-mod));
        }
        return sb.toString();
    }
}