class Solution {
        public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : time) {
            int reducedTime = t % 60;
            int theOther = (reducedTime == 0) ? 0 : 60 - reducedTime;
            ans += count.getOrDefault(theOther, 0); 
            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0));
        }
        return ans;
    }
}