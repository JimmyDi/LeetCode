
// Horizontal scanning
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

// Vertical scanning
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++){
                // if i has reached the length of element j, substring the String
                // or if there is a characteristic in element j is different from the
                // characteristic in strs[0]
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}

// Divide and conquer (recursion)

// 0 4 (mid = 2)
// 0 2 (mid =1 )
// 0 1( mid = 0)
// 0 0 get strs[0]
// 1 1 get strs[1]
// compare prefix
// 2 2 get strs[2]
// compare prefix
// 3 4 (mid =3)
// 3 3 get strs[3]
// 4 4 get strs[4]
// compare prefix
// compare prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length-1);
    }
    
    private String longestCommonPrefix(String[] strs, int l, int r){
        if(l == r){
            return strs[l];
        } else {
            int mid = (l + r)/2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }
    
    String commonPrefix(String lcpLeft, String lcpRight){
        int min = Math.min(lcpLeft.length(), lcpRight.length());
        for(int i=0; i < min; i++){
            if(lcpLeft.charAt(i) != lcpRight.charAt(i)){
                return lcpLeft.substring(0, i);
            }
        }
        return lcpLeft.substring(0,min);
    }
}

