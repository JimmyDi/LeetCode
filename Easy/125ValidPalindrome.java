package DailyTest;
public class _125ValidPalindrome {
	
    public static boolean isPalindrome(String s) {
	    if(s.length() == 0 || s.length() == 1) return true;
	    s = s.toLowerCase();
	    for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
	    	char left = s.charAt(i);
	    	char right = s.charAt(j);
	    	
	        while(! ( ('a' <= left && left <= 'z') ||('0' <= left && left <= '9') ) && i < j) left = s.charAt(++i);
	        while(! ( ('a' <= right && right <= 'z') ||('0' <= right && right <= '9') ) && i < j) right = s.charAt(--j);
	        if( left != right ) return false;
	    }
	    return true;
    }
    
    public static void main(String[] args) {
    	String input = "A man, a plan, a canal: Panama";
    	boolean result = _125ValidPalindrome.isPalindrome(input);
    	System.out.println(result);
    }
    
}