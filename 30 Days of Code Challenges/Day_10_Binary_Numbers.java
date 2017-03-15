import java.util.*;

public class Day_10_Binary_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binNum = toBinary(n);
        int ones = consecutiveOnes(binNum);
        System.out.println(ones);
    }
    
    public static String toBinary(int num) {
        String binary = Integer.toString(num % 2);
        while (num / 2 > 0) {
            num = num / 2;
            binary += num %2;
        }
        return binary;
    }
    
    public static int consecutiveOnes(String binaryNum) {
        int strLen = binaryNum.length();
        int maxOnes = 0;
        int currOnes = 0;
        
        for (int ii = 0; ii < strLen; ii++) {
            if(binaryNum.charAt(ii) == '1')
                currOnes++;
            else {
                maxOnes = Math.max(maxOnes, currOnes);
                currOnes = 0;
            }
        }
        
        maxOnes = Math.max(maxOnes, currOnes);
        
        return maxOnes;
    }
}