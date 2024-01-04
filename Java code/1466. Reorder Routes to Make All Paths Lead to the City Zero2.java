class Solution {
    public int minReorder(int n, int[][] connections) {
         int[] parent=new int[n];    
        for(int i=0;i<n;i++)      
            parent[i]=i;
            int ans=0;                 
        for(int j=0;j<n;j++){
            boolean change=false;      
            for(int i=0;i<n-1;i++){
                int u=connections[i][0]; 
                int v=connections[i][1];  
                if(parent[u]==0 && parent[v]==0)  
                    continue;              
                if(parent[u]==0){        
                    ans++;                 
                    parent[v]=0;          
                    change=true;          
                }else if(parent[v]==0){
                    parent[u]=0;         
                    change=true;          
                }                          
            }
            if(!change)                     
                break;
        }
        return ans; 
    }
}
