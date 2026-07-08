class Solution {
    public String[] findWords(String[] words) {
        
        String a =  "qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";

        ArrayList<String> arl = new ArrayList<>();

        for(String i :words){
           

            char arr[]=i.toLowerCase().toCharArray();
            boolean valid=true;

            if(a.contains(String.valueOf(arr[0]))){
                for(char j : arr){
                    if(!a.contains(String.valueOf(j))){
                        valid=false;
                        break;
                    }

                }
          
            }

             else if(b.contains(String.valueOf(arr[0]))){
                for(char j : arr){
                    if(!b.contains(String.valueOf(j))){
                        valid=false;
                        break;
                    }
                  
                }
               
            }
               else {
                for(char j : arr){
                    if(!c.contains(String.valueOf(j))){
                        valid=false;
                        break;
                    }
                }
               
            }
            if(valid==true){
                arl.add(i);
            }

        }
        String ans[]=new String[arl.size()];
        for(int i=0;i<arl.size();i++){
            ans[i]=arl.get(i);
        }
        return ans;
    }
}