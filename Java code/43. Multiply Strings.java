import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger i=new BigInteger(num1);
        BigInteger j=new BigInteger(num2);
        BigInteger a=i.multiply(j);
        String s=a.toString();
        return s;
    }
}
