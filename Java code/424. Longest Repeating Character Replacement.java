class Solution {
    public int characterReplacement(String s, int k) {
       int len=s.length();
        int[] count=new int[26];
        int st=0,maxCount=0,max=0;
        for (int i=0;i<len;i++){
            maxCount=Math.max(maxCount,++count[s.charAt(i)-'A']);
            while(i-st+1-maxCount>k){
                count[s.charAt(st)-'A']--;
                st++;
            }
            max=Math.max(max,i-st+1);
        }
        return max;  
    }
}
