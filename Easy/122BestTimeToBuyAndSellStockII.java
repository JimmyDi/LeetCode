// Brute Force Method
class Solution {
    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }
    
    private int calculate(int[] prices, int s) {
        if(s >= prices.length) return 0;
        int max = 0;
        for(int i = s ; i < prices.length; i++) {
            int maxValue = 0;
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] < prices[j]) {
                    int profit = calculate(prices, j + 1) + prices[j] - prices[i];
                    if(profit > maxValue) maxValue = profit;
                }
            }
            if( maxValue > max ) max = maxValue;
        }
        return max;
    }
}
// Time Complexity O(n^n) Space Complexity O(n)

// Peak Vally Approach
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int i = 0;
        int peak = prices[0];
        int vally = prices[0];
        int max = 0;
        
        while(i < prices.length - 1) {
            while(i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            vally = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            max += peak - vally;
        }
        
        return max;
    }
}
// Time Complexity O(n) Space Complexity O(1)

//Simple One Pass
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) max += prices[i] - prices[i - 1];
        }
        return max;
    }
}