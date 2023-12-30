class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;
        int[] map=new int[26];
        for(String w:words){
            for(char c:w.toCharArray()){
                map[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(map[i]%n!=0) return false; 
        }
        return true;
    }
}
