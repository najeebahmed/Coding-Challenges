import java.util.*;

public class Day_25_Running_Time_and_Complexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int numTests;
        int num;
        
        numTests = in.nextInt();
        
        for(int ii = 0; ii < numTests; ii++) {
            num = in.nextInt();
            if(isPrime(num))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        
        }
    }
    
    public static boolean isPrime(int num) {
        if(num < 2)
            return false;
        
        for(int ii = 2; ii <= Math.sqrt(num); ii++)
            if(num % ii == 0)
                return false;
            
        return true;
    }
}