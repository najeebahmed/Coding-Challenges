using System;
using System.Linq;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        maximumDifference = 0;
        
        if(elements.Length == 0)
            maximumDifference = 0;
        else if(elements.Length == 1)
            maximumDifference = elements[1];
        
        for(int ii = 0; ii < elements.Length - 1; ii++)
            for(int jj = ii + 1; jj < elements.Length; jj++)
                maximumDifference = Math.Max(Math.Abs(elements[ii] - elements[jj]), maximumDifference);
    }
} // End of Difference Class

class Solution {
    
    static void Main(string[] args) {
        Convert.ToInt32(Console.ReadLine());
        
        int[] a = Console.ReadLine().Split(' ').Select(x=>Convert.ToInt32(x)).ToArray();
        
        Difference d = new Difference(a);
        
        d.computeDifference();
        
        Console.Write(d.maximumDifference);
    }
}