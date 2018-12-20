package com.company;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[][] diverseArr2D = {{3,6,7,3}, {2,5,6,3}, {3,6,2,11}, {12,1,3,5}};
        int[][] nondiverseArr2D = {{1,1,1,1}, {1,1,1,1}, {1,2,1,1}, {1,1,3,4,}};
        System.out.println("1D Array Sum: " + arraySum(arr));
        System.out.println("First 2D Array Row Sums: " + Arrays.toString(rowSums(diverseArr2D)));
        System.out.println("Is the first 2D array diverse: " + isDiverse(diverseArr2D));
        System.out.println("Second 2D Array Row Sums: " + Arrays.toString(rowSums(nondiverseArr2D)));
        System.out.println("Is the second 2D array diverse: " + isDiverse(nondiverseArr2D));


    }

    public static int arraySum(int[] arr)
    {
        int total = 0;
        for (int i = 0; i<arr.length;i++)
        {
            total += arr[i];
        }
        return total;
    }

    public static int[] rowSums(int[][] arr)
    {
        int[] rowVals = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                rowVals[i] += arr[i][j];
            }
        }
        return rowVals;
    }

    public static boolean isDiverse(int[][] arr)
    {
        int[] rowVals = rowSums(arr);
        for(int i = 0;i<rowVals.length;i++)
        {
            for(int j = i + 1;j<rowVals.length;j++)
            {
                if(rowVals[i]==rowVals[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
