class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(count>1){
                count--;
                sb.append('1');
            } else {
                sb.append('0');
            }
        }       
        sb.append('1');
        return sb.toString();   
    }
}
