package com.lorgio.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by lorgio on 21-09-15.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int value;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for(int i = 0; i < n; i++){
            value = in.nextInt();
            if(value == 0){
                zeroCount++;
            }
            if(value > 0){
                positiveCount++;
            }else if(value < 0){
                negativeCount++;
            }
        }
        System.out.println(format(divide(n, positiveCount)));
        System.out.println(format(divide(n, negativeCount)));
        System.out.println(format(divide(n, zeroCount)));
    }

    public static float divide(float base, float num){
        return num / base;
    }

    public static String format(float num){
        return String.format("%.6f", num);
    }
}
