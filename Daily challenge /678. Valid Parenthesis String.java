class Solution {
    public boolean checkValidString(String s) {
          int r=0,l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            l++;
            else
            l--;
            if(ch!=')')
            r++;
            else
            r--;
            if(r<0)
            break;
            l=Math.max(0,l);
        }
        return l==0;
    }
}
