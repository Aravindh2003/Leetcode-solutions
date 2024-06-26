class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        int[][] w = new int[n][2];
        for(int i = 0; i<n; i++){
            w[i][0] = quality[i];
            w[i][1] = wage[i];
        }
        double ans = Double.MAX_VALUE;
        int sum = 0;
        Arrays.sort(w,(a,b) -> a[1]*b[0]-b[1]*a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0; i<k-1; i++){
            sum+=w[i][0];
            pq.add(w[i][0]); 
        }
        for(int i = k-1; i<n; i++){
            double ratio = w[i][1]/(double)w[i][0];
            int currSum = sum+w[i][0];
            ans = Math.min(ans,currSum*ratio);
            pq.add(w[i][0]);
            sum+=w[i][0]-pq.poll();
        }
        return ans; 
    }
}
