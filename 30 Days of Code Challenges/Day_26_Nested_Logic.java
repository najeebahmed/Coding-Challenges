import java.util.*;

public class Day_26_Nested_Logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int[] dueDate = new int[3];
        int[] returned = new int[3];
        
        for(int ii = 0; ii < 3; ii++)
            returned[ii] = in.nextInt();
        
        for(int ii = 0; ii < 3; ii++)
            dueDate[ii] = in.nextInt();
        
        System.out.println(calculateFine(dueDate, returned));
    }
    
    public static int calculateFine(int[] dueDate, int[] returned) {
        int lateDays = returned[0] - dueDate[0];
        int lateMonths = returned[1] - dueDate[1];
        int lateYears = returned[2] - dueDate[2];      
        
        if(lateYears > 0)
            return 10000;
        else if(lateYears == 0) {
            if(lateMonths > 0)
                return lateMonths * 500;
            else if(lateMonths == 0) {
                if(lateDays > 0)
                    return lateDays * 15;
                else
                    return 0;
            } else
                return 0;
        } else
            return 0;
    }
}