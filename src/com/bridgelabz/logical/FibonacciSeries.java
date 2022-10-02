// Fibonacci Series
// 1,2,3,5,8,13,21,34,55,89,144,233,377,...

package com.bridgelabz.logical;
import java.util.Scanner;
public class FibonacciSeries
{
    public static void main (String[]args)
    {
        int num;
        int a = 0, b = 1;
        System.out.print("Enter the Nth Fibonacci Series of Number : ");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        // Here we are printing 0th and 1st terms
        System.out.print (a + " , " + b + " , ");
        int nextTerm;
        // printing the rest of the terms here
        for (int i = 2; i < num; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}

