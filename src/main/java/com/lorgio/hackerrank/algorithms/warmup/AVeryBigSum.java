package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 21-09-15.
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        long sum = 0;
        long value;
        for(int i = 0; i < n; i++){
            value = in.nextLong();
            sum = opSum(sum, value);
        }
        System.out.println(sum);
    }

    public static long opSum(long a, long b){
        return a + b;
    }
}
