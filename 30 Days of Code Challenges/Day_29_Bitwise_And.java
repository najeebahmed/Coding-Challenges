import java.util.*;

public class Day_29_Bitwise_And {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            System.out.println(maxAnd(n, k));
        }
        
        in.close();
    }
    
    public static int maxAnd(int n, int k) {
        int max = 0;
        
        for(int ii = 0; ii < n; ii++) {
            for(int jj = ii + 1; jj <= n; jj++) {
                int bitAnd = ii & jj;
                if(bitAnd < k)
                    max = Math.max(max, bitAnd);
            }
        }
        
        return max;
    }
}

