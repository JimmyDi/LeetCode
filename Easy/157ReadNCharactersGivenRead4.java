public class Solution extends Reader4 {
    public int read(char[] buf, int n) {
        int count = 0;
        char[] mybuf = new char[4];
        while(count < n) {
            int num = read4(mybuf);
            if(num == 0) break;
            int index = 0;
            while(index < num && count < n) {
                buf[count++] = mybuf[index++];
            }
        }
        return count;
    }
}