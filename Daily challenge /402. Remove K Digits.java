class Solution {
    public String removeKdigits(String num, int k) {
        char[] stack = new char[num.length()];
        int top = 0;
        stack[top] = num.charAt(0);
        for(int i = 1; i < num.length(); i++){
            char c = num.charAt(i);
            while(top >= 0 && stack[top] > c && k > 0){
                top--;
                k--;
            }
            top++;
            stack[top] = c;
        }
        while(k > 0){
            top--;
            k--;
        }
        int i = 0;
        while(i < stack.length && stack[i] == '0'){
            i++;
        }
        StringBuilder res = new StringBuilder("");
        for(; i <= top; i++){
            res.append(stack[i]);
        }
        if(res.length() == 0)
            return "0";
        return res.toString();
    }
}
