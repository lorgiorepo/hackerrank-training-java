package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 20-09-15.
 */
public class SolveMeSecond {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a, b;
        t = in.nextInt();
        for (int i = 0; i < t; i++){
            a = in.nextInt();
            b = in.nextInt();
            sum = opSum(a, b);
            System.out.println(sum);
        }
    }

    static int opSum(int a, int b){
        return a + b;
    }
}
