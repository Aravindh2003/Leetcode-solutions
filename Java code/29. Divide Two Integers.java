class Solution {
    public int divide(int dividend, int divisor) {

    long d=(long)dividend/(long)divisor;
        if(d > (long)Math.pow(2,31)-1) d = (long)Math.pow(2,31)-1;
        if(d < (-1)*(long)Math.pow(2,31)) d = (long)Math.pow(-2,31);
        return (int)d;
    }
}
