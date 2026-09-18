class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int x : nums1){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        HashSet<Integer>ls = new HashSet<>();
        for(int x:nums2){
            if(mp.containsKey(x)){
                ls.add(x);
            }
        }
        int n = ls.size();
        int[] ans= new int[n];
        int i =0;
        for(int x:ls){
            ans[i++] = x;
        }
        return ans;
    }
}