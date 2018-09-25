// 
class Solution {
    public String countAndSay(int n) {
        if(n == 0) return "";
        if(n == 1) return "1";
        
        String result = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        char last = result.charAt(0);
        int count = 1;
        
        for(int i = 1; i < result.length(); i++){
            if(result.charAt(i) == last){
                count++;
            } else {
                sb.append(count);
                sb.append(last);
                last = result.charAt(i);
                count = 1;
            }
        }
        
        sb.append(count);
        sb.append(last);
        
        return sb.toString(); 
    }
}