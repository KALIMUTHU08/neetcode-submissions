class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i =0;i<n;i++){
            g.add(new ArrayList());
        }
        for(int[] x:edges){
            int a = x[0];
            int b = x[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==destination) return true;
            for(int x:g.get(node)){
                if(!visited[x]==true){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return false;
    }
}