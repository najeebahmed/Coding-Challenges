using System;

public interface AdvancedArithmetic {
    int divisorSum(int n);
}

//Write your code here
class Calculator : AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for(int ii = 1; ii <= n; ii++) {
            if(n % ii == 0)
                sum += ii;
        }
        
        return sum;
    }
}

class Solution {
    
    static void Main(string[] args){
        int n = Int32.Parse(Console.ReadLine());
      	AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        Console.WriteLine("I implemented: AdvancedArithmetic\n" + sum); 
    }
}