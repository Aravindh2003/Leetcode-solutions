class Solution {
    List<Pair<Integer, Boolean>>[] adj;
     int c=0;
    private void dfs(int city, int parent) {
     for(var a:adj[city]){
       var neighbor=a.getKey();
       var needsReOrder=a.getValue();
      if(neighbor!=parent){
        if(needsReOrder) c++;
        dfs(neighbor,city);
      }
    }
  }
    public int minReorder(int n, int[][] connections) {
         adj=new ArrayList[n];

    for (var i=0;i<n;i++)
      adj[i] = new ArrayList<>();
    for (var con:connections) {
      adj[con[0]].add(new Pair(con[1], true));
      adj[con[1]].add(new Pair(con[0], false));
    }
    dfs(0, -1);

    return c; 
    }
}
