package com.aw.automationtraining;

/* 4. One-Dimensional & Multi-Dimensional Arrays

Assignment:

1. Create a 1D array of 5 integers and print their sum.
2. Create a 2D array '3x3' of numbers and print all elements using nested loops.
 */

 public class ArrayAssignment 
 {
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int number : numbers) 
        {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
    
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for(int i=0; i<matrix.length; i++) 
    {
        for(int j=0; j<matrix[i].length; j++) 
        {
            System.out.println("Element at position [" + i + "][" + j + "] is: " + matrix[i][j]);
        }
    }
}

}
