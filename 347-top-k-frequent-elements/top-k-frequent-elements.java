class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> mp.get(b) - mp.get(a)
        ); 
        for(int x : mp.keySet()){
            pq.add(x);
        }
        int[] ans = new int[k];
        for(int i =0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}