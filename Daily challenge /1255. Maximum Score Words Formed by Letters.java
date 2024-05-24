class Solution {
     int rec(String[] words,int[] lett,int[] score,int i){
        int n=words.length;
        if(i==n) return 0;
        int take=0,f=0,ans=0;
        for(int j=0;j<words[i].length();j++){
            if(lett[words[i].charAt(j)-'a']>0){
                lett[words[i].charAt(j)-'a']--;
                take+=score[words[i].charAt(j)-'a'];
            }
            else{
                f=j+1;
                take=0;
                break;
            }
        }
        if(f==0){    
            f = words[i].length()+1;
            ans = Math.max(ans, take + rec(words, lett, score, i+1));
        }
        for(int j=0; j<f-1 ; j++){
            lett[words[i].charAt(j)-'a']++;
        }
        ans = Math.max(ans, rec(words, lett, score, i+1));
        return ans;
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] lett = new int[26];
        Arrays.fill(lett,0);
        for(int i=0; i<letters.length; i++){
            lett[letters[i]-'a']++;
        }
        return rec(words,lett,score,0);
    }
}
