class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        int result=1;
        if(x==0)
        return 0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sqrt=(long) mid*mid;
            if(sqrt==x)
            return mid;
            else if(sqrt<x){
            result=mid;
            left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
}