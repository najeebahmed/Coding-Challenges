using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    static void Main(String[] args) {
        int[][] arr = new int[6][];
        
        for(int arr_i = 0; arr_i < 6; arr_i++){
           string[] arr_temp = Console.ReadLine().Split(' ');
           arr[arr_i] = Array.ConvertAll(arr_temp,Int32.Parse);
        }
        
        int max = -64;
        for(int ii = 0; ii < 4; ii++){
            for(int jj = 0; jj < 4; jj++){
                int sum = 0;
                for(int kk = 0; kk < 3; kk++)
                    sum += arr[ii][jj + kk];
                sum += arr[ii + 1][jj + 1];
                for(int kk = 0; kk < 3; kk++)
                    sum += arr[ii + 2][jj + kk];
                max = Math.Max(sum, max);
            }
        }    
        
        Console.WriteLine(max);
    }
}