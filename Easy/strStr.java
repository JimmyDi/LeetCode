// Elegant Solution
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        for(int i=0; ; i++){
            for(int j=0; ;j++){
                if(j == needle.length()) return i;
                if(i + j == haystack.length()) return -1;
                if(needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}

// Common way
class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        int threshold = l1 - l2;
        
        if(threshold < 0) {
            return -1;
        } else if(l2 == 0){
            return 0;
        }
        
        for(int i = 0; i <= threshold; ++i){
            if(haystack.substring(i, i+l2).equals(needle)) return i;
        }
        
        return -1;
    }
}
