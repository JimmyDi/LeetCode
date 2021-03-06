class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int pop = x%10;
            x = x/10;
            if(reverse > Integer.MAX_VALUE || (reverse == Integer.MAX_VALUE && pop > 8)) return 0;
            if(reverse < Integer.MIN_VALUE || (reverse == Integer.MIN_VALUE && pop < -7)) return 0;
            reverse = reverse*10 + pop;
        }
        return reverse;
    }
}