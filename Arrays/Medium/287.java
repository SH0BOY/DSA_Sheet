class Solution {
    public int findDuplicate(int[] nums) {
        
        int check[]= new int[nums.length];
        

        for(int i :nums){
            if(check[i]==1){
                return i;
            }
            check[i]++;
        }
        
    return -1;
    }
}