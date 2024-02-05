class Solution {
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int a = s.indexOf(c);
            if (a!= -1 && a== s.lastIndexOf(c)) min = Math.min(min,a);
        }
        return (min != Integer.MAX_VALUE) ? min : -1;
    }
}
