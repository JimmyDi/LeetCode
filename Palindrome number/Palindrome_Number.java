class Solution {
    
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int halfResult = 0 ;
        while (x>halfResult){
            halfResult = halfResult * 10 + x%10;
            x = x/10;
        }

        return x==halfResult || x==halfResut/10;
    }
}