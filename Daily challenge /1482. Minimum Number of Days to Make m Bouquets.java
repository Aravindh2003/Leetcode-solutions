class Solution {
    public int minDays(int[] bloom, int m, int k) {
       int low=1;
        int high=-1;
        for(int i:bloom){
            high=Math.max(high,i);
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int boques=0;
            int count=0;
            for(int i=0;i<bloom.length;i++){
                while(i!=bloom.length && bloom[i]<=mid){
                    count++;
                    i++;
                }
                boques+=(count/k);
                count=0;
            }
            if(boques>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans; 
    }
}
