// Coupon Numbers Given N distinct Coupon Numbers, how many random numbers do you
//need to generate a distinct coupon number?

package com.bridgelabz.logical;

import java.util.Scanner;

public class CouponNumbers
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number range to generate coupons");

        int range = sc.nextInt();

        boolean[] arr = new boolean[range];
        int count = 0;
        int distinct = 0;

        while (distinct < range) {

            int value = (int) (Math.random() * (range - 0)) + 0;

            System.out.print(value + ",");

            if (!arr[value]) {
                distinct++;

                arr[value] = true;

                System.out.println(arr[value] + " ");

            }
            count++;

        }
        System.out.println(count + " N times loop runs for finding distinct");
    }
}