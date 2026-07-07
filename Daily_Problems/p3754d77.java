class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        int x=0;
        for(char i :String.valueOf(n).toCharArray()){
                if(i-'0'!=0){
                    x=x*10+(i-'0');
                    sum=sum+(i-'0');
                }
        }
        return sum*x;
    }
}