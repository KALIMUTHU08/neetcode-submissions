class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>st = new HashSet<>();
        List<Integer> ls = new LinkedList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(st.contains(nums[i])){
                ls.add(nums[i]);
            }
            st.add(nums[i]);
        }
        return ls;
    }
}