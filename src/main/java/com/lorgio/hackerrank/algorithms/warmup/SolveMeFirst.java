package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 20-09-15.
 */
public class SolveMeFirst {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = opSum(a, b);
        System.out.println(sum);
    }
    static int opSum(int a, int b){
        return a + b;
    }
}
