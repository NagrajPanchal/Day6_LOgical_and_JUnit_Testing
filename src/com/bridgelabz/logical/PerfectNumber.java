// Perfect Number
// Input Number  6 ---> 1 2 3 4 5
// 6 ---> 1+2+3 = 6
// 1,2,3 all divids by 6

package com.bridgelabz.logical;
import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args) {
        int n,sum=0;
        System.out.print("Enter any Number : ");
        Scanner scanner = new Scanner (System.in);
        n= scanner.nextInt(); // Read integer
        for (int i = 1; i<n; i++) // 1<6 i++
        {
            if (n%i== 0) // 6%1 = 0
                sum = sum+i; // 1=0+1
        }
        if (n==sum) // 6==6
            System.out.println(n+ " is a Perfect Number "); //input = sum of divisible numbers
        else
            System.out.println(n+ " is Not a Perfect Number"); //input != sum of divisible numbers
    }
}
