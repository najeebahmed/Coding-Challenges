import java.util.*;

public class Day_05_Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int ii = 1, mult; ii <= 10; ii++) {
            mult = ii * n;
            System.out.println(n + " x " + ii + " = " + mult);
        }
            
    }
}

