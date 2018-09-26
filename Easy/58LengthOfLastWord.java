// While Loop method
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, tail = s.length() - 1;
        while(tail >= 0 && s.charAt(tail) == ' ') tail--;
        while(tail >=0 && s.charAt(tail) != ' '){
            tail--;
            length++;
        }
        return length;
    }
}

// Common method
class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ') return result;
            result++;
        }
        return result;
    }
}