// Stopwatch Program for measuring the time that elapses between the start and end clicks

package com.bridgelabz.logical;

import java.util.Scanner;

public class StopWatch
{
    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;

    // to start timer
    public void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    // to stop timer
    public void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    public long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);

        StopWatch stopWatchObject = new StopWatch();

        System.out.print("Press '1' to Start Time : ");
        scannerObject.nextInt();
        stopWatchObject.start();

        System.out.print("\nPress '2' to Stop Time : ");
        scannerObject.nextInt();
        stopWatchObject.stop();

        long totalTime = stopWatchObject.getElapsedTime();
        System.out.println("\nTotal Time Elapsed(in millisec) is:" + totalTime);
        System.out.println("Converting millisec to seconds: " + (totalTime / 1000) + " sec");
    }
}