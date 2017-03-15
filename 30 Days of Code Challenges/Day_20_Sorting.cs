using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
    
    static void swap(int[] a, int jj) {
        int ii = a[jj];
        a[jj] = a[jj + 1];
        a[jj + 1] = ii;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] a_temp = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(a_temp,Int32.Parse);
        int totalSwaps = 0;
        
        for(int ii = 0; ii < n; ii++) {
            int numSwaps = 0;
            for(int jj = 0; jj < n - 1; jj++) {
                if(a[jj] > a[jj + 1]) {
                    swap(a, jj);
                    numSwaps++;
                }
            }
            totalSwaps += numSwaps;
            
            if(numSwaps == 0)
                break;
        }
        
        Console.WriteLine("Array is sorted in {0} swaps.\nFirst Element: {1}\nLast Element: {2}",
                          totalSwaps, a[0], a[n - 1]);
    }
}