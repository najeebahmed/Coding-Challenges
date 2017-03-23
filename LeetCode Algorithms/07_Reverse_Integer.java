public class 07_Reverse_Integer {
    public int reverse(int x) {
        long reversed = 0;
        boolean negative = (x < 0);

        while(Math.abs(x) > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if((reversed < 0 && !negative) ||(reversed > 0 && negative)) {
                reversed = 0;
                x = 0;
            }
        }

        if(reversed > (long)Integer.MAX_VALUE || reversed < (long)Integer.MIN_VALUE)
            reversed = 0;

        return (int)reversed;
    }
}
