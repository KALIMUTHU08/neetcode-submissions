/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }..\

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root!=null)
           q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> curr = new LinkedList<>();
          for(int i =0;i<n;i++){ 
             Node node = q.poll();
            curr.add(node.val);
            List<Node> ch = node.children;
            for(Node x : ch){
                q.add(x);
            }
            }
            ans.add(curr);
            
        }
        return ans;
    }
}