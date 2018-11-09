class Solution {
    public String convertToTitle(int n) {
        return  n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + n % 26);
    }
}

class Solution {
    public String convertToTitle(int n) {
        String result = "";
        while(n != 0) {
            int rem = (n -1) % 26;
            result = (char)(rem + 'A') + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}