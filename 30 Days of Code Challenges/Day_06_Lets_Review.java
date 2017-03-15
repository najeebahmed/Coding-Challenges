import java.util.*;

public class Day_06_Lets_Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String myString = in.next();
        int numStrings = Integer.parseInt(myString);
        
        for (int jj = 0; jj < numStrings; jj ++) {
            myString = in.next();
            int lenMyString = myString.length();
            String oddStr = "";
            String evenStr = "";

            for (int ii = 0; ii < lenMyString; ii++) {
                if (ii % 2 == 0)
                    evenStr = evenStr + myString.charAt(ii);
                else
                    oddStr += myString.charAt(ii);
            }

            System.out.println (evenStr + " " + oddStr);
        }
        
    }
}