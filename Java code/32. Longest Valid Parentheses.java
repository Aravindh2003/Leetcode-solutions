class Solution {
    public int longestValidParentheses(String s) {
    int ans = 0,left = 0,right = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                left++;
            }else{
                right++;
            }if(left == right){
                ans = Math.max(ans, left * 2);
            }else if(right > left){
                left = 0; right = 0;
            }
        }
        left = 0; right = 0;
        for(int i = s.length() - 1; i >= 0 ; i--){
            if(s.charAt(i) == '('){
                left++;
            }else{
                right++;
            }if(left == right){
                ans = Math.max(ans, right * 2);
            }else if(right < left){
                left = 0; right = 0;
            }
        }
        return ans;
    }
}
