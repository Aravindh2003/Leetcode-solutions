class Solution {
    private int[] sum;
    private int[] mul;
    private List<Integer> childs[];
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        childs = new List[n];
        for(int i = 0; i < n; i++)
            childs[i] = new ArrayList<>();
        for(int edge[]: edges) {
            childs[edge[0]].add(edge[1]);
            childs[edge[1]].add(edge[0]);
        }
        sum = new int[n];
        mul = new int[n];
        dfs1(0, -1);
        dfs2(0, -1);
        return sum;
    }
    private void dfs1(int node, int par) {
        mul[node] = 1;
        for(int child: childs[node]) {
            if(child == par) continue;
            dfs1(child, node);
            sum[node] += sum[child] + mul[child];
            mul[node] += mul[child];
        }
    }
    private void dfs2(int node, int par) {
        if(par != -1) {
            sum[node] = sum[par] + mul[par] - 2 * mul[node];
            mul[node] = mul[par];
        }
        for(int child: childs[node]) {
            if(child == par) continue;
            dfs2(child, node);
        }
    }
}
