class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> ls = new ArrayList();
        for(int x : nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int m = n/3;
        for(int x : mp.keySet()){
            if(mp.get(x)>m){
                ls.add(x);
            }
        }
        return ls;
    }
}