class Solution {
    public int titleToNumber(String columnTitle) {
     int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            sum*=26;
           int mod = columnTitle.charAt(i) - 'A'+1;
            sum+=mod;
        }
        return sum;
    }
}
