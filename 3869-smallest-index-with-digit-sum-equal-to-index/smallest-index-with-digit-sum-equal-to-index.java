class Solution {
    public int smallestIndex(int[] nums) {
        int min =  Integer.MAX_VALUE;
        int ans=-1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int m = nums[i];
            int sum = 0;
            while(m!=0){
                int a = m%10;
                sum+=a;
                m/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}