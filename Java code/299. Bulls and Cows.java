class Solution {
    public String getHint(String secret, String guess) {
        int a[]=new int[10];
        int b[]=new int[10];
        int n=secret.length();
        int bull=0;
        for(int i=0;i<n;i++){
            char a1=secret.charAt(i);
            char a2=guess.charAt(i);
            if(a1==a2) 
            ++bull;
            else{
                a[a1-'0']++;
                b[a2-'0']++;
            }
        }
        int cow=0;
        for(int i=0;i<10;i++){
            cow+=Math.min(a[i],b[i]);
        }
        return "" +bull+"A"+cow+"B";
    }
}
