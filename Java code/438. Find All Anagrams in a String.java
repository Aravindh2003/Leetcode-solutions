class Solution {
    List<Integer> li=new ArrayList<>();
    public List<Integer> findAnagrams(String s, String p) {
          char[] c=p.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<s.length()-p.length()+1;i++){
            String r=s.substring(i,i+p.length());
            helper(r,p,i,c);
        }
        return li;
    }
    void helper(String r, String p,int k,char[] c){
        char[] ch=r.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<p.length();i++){
            if(ch[i]!=c[i]){
                return;
            }
        }
        li.add(k);
    }
}
