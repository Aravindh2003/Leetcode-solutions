public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int r=0;
        for(int i=0;i<32;i++){
            int l=n&1;
            int m=l<<(31-i);
            r=r|m;
            n=n>>1;
        }
        return r;
    }
}
