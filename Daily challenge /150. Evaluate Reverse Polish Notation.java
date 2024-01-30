class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int y = st.pop();
                int x = st.pop();
                if(tokens[i].equals("+"))
                    st.push(x+y);
                else if(tokens[i].equals("-"))
                    st.push(x-y);
                else if(tokens[i].equals("*"))
                    st.push(x*y);
                else if(tokens[i].equals("/"))
                    st.push(x/y);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.peek();  
    }
}
