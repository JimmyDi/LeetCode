//Brute Force

class Solution {
    public int maxProfit(int[] prices) {        
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > max) max = prices[j] - prices[i];
            }
        }
        
        return max;
    }
}

// Time Complexity O(n^2) Space Complexity O(1)


// One Pass

class Solution {
    public int maxProfit(int[] prices) {
        int minPoint = Integer.MAX_VALUE;
        int maxValue = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPoint) minPoint = prices[i];
            else if(prices[i] - minPoint > maxValue) maxValue = prices[i] - minPoint;
        }
        
        return maxValue;
    }
}

// Time Complexity O(n) Space Complexity O(1)
