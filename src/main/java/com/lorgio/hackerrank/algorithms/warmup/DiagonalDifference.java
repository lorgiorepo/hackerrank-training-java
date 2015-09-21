package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 21-09-15.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, current;
        n = in.nextInt();
        int sumLeft = 0, sumRight = 0;
        int diff;
        for(int x = 0; x < n ; x++){
            for(int y = 0; y < n; y++){
                current = in.nextInt();
                if(x == y){
                    sumLeft = opSum(sumLeft, current);
                }

                if(x+y == (n - 1)){
                    sumRight = opSum(sumRight, current);
                }
            }
        }
        diff = Math.abs(opDiff(sumLeft, sumRight));
        System.out.println(diff);
    }

    public static int opSum(int a, int b){
        return a + b;
    }

    public static int opDiff(int a, int b){
        return a - b;
    }

}
