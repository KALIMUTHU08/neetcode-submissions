class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int m = 0;
         while(a!=0){
            int b=a%10;
            m = (m*10)+b;
            a/=10;
         }
         int ans = n-m;
         if(ans<0) ans = -ans;
         return ans;
    }
}