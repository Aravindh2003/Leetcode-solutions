class Solution {
    public int repeatedStringMatch(String a, String b) {
       /* String a1=a;
        int count =1;
        int repeat = b.length()/a.length();
        for(int i=0;i<repeat+2;i++){
            if(a.contains(b)){
                return count;
            }
            else{
                a+=a1;
                count++;
            }
        }
        return -1;*/
        StringBuilder s = new StringBuilder(a);
        int count = 1;
        while (s.length() < b.length()) {
            s.append(a);
            count++;
        }
        if (s.indexOf(b) != -1) {
            return count;
        }
        s.append(a);
        count++;
        if (s.indexOf(b) != -1) {
            return count;
        }
        return -1;
    }
}
