class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int m = n;
        while(m!=0){
            int a  = m%10;
            sum+=a;
            pro*=a;
            m/=10;
        }
        sum+=pro;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}