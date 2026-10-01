class Solution {
    public int[] twoSum(int[] arr, int t) {
        int ans[] = new int[2];
        int n = arr.length;
        for(int  i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int curr = arr[i];
                if(arr[j]==t-curr){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}