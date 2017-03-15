import java.util.*;

public class Day_09_Recursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myNum = in.nextInt();
        myNum = factorial(myNum);
        System.out.println(myNum);
    }
    
    static public int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return (num * factorial(num - 1));
    }
}