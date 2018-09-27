// Brute Force
class Solution {
    public int climbStairs(int n) {
        int result = getStairs(0, n);
        return result;
    }
    
    private int getStairs(int i, int n) {
        if(i > n) return 0;
        if(i == n) return 1;
        
        return getStairs(i + 1, n) + getStairs(i + 2, n);
    }
}

// With memo memory
// Do not need to calculate the previous result again
class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    
    private int climb_Stairs(int i, int n, int[] memo) {
        if(i > n) return 0;
        if(i == n) return 1;
        if(memo[i] > 0) return memo[i];
        
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}

// DP
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

// Fibonacci Number
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int first = 1, second = 2;
        for(int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}

//