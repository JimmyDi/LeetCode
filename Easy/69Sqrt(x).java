// Newton Method
class Solution {
    public int mySqrt(int x) {
        long r = x;
        while(r*r > x) {
            r = (r + x / r) / 2;
        }
        return (int)r;
    }
}

// Binary Search
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int low = 1, high = x;
        while(true) {
            int mid = low + (high - low) / 2;
            if( mid <= x / mid && (mid + 1) > x / (mid + 1)) return mid;
            else if( mid < x / mid) low = mid++;
            else high = mid--;
        }        
    }
}