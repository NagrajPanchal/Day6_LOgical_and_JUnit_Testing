//Number is Prime or Not
//2,3,5,7,11,13,17,19,23,....

package com.bridgelabz.logical;
import java.util.Scanner;
public class PrimeNumberOrNot
{
    public static void main (String[]args)
    {
        int i,n,count=0;
        System.out.print("Enter any number : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        // 0 and 1 are not prime numbers also, negative numbers are not prime
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(+n+" Number is 'prime'");
        else
            System.out.println(+n+" is not 'Prime'");
    }
}