class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length,m=nums2.length;
        int nums[] = new int[n+m];
        int a = 0;
        for(int num : nums1){
            nums[a++] = num;
        }for(int num : nums2){
            nums[a++] = num;
        }
        Arrays.sort(nums);
        int t  = nums.length;
        double ans = 0;
        if(t%2==0){
            ans = (double)(nums[t/2-1]+nums[(t/2)])/2;
        }
        else{
            ans = nums[(t/2)];
        }
        return ans;
    }
}