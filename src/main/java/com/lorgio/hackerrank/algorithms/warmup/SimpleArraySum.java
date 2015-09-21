package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 21-09-15.
 */
public class SimpleArraySum {


    public static void main(String[] args) {
        int n, value;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            value = in.nextInt();
            sum = opSum(sum, value);
        }
        System.out.println(sum);
    }

    public static int opSum(int a, int b){
        return a + b;
    }
}
