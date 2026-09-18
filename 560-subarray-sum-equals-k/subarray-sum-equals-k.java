class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int x : nums) {
            sum += x;
            if (mp.containsKey(sum - k)) {
                ans += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}