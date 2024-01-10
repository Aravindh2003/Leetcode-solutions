class Solution {
    public boolean isPalindrome(String s) {
       String t=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
       String r=new StringBuffer(t).reverse().toString();
       return t.equals(r); 
    }
}
