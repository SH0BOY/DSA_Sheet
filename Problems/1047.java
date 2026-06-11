class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();

        for(char i :s.toCharArray()){
            if(stk.isEmpty()){
                stk.push(i);
            }
            else if(stk.peek()==i){
                stk.pop();
            }
            else{
                stk.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(Character i : stk){
            sb.append(i);
        }
        return sb.toString();
    }
}