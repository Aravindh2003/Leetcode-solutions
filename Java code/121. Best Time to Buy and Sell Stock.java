class Solution {
    public int maxProfit(int[] prices) {
       int a= Integer.MAX_VALUE;
        int b= 0;
        int result= 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < a){
                a= prices[i];
            }
            result= prices[i]-a;
            if(b< result){
                b= result;
            }
        }
        return b; 
    }
}
