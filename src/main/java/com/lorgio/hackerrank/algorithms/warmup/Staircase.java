package com.lorgio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by lorgio on 21-09-15.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int numberOfSpaces = 0, character = 0;
        for(int i = 0; i < n; i++){
            character = (i + 1);
            numberOfSpaces = n - (i + 1);
            printCharacter(" ", numberOfSpaces, false);
            printCharacter("#", character, true);
        }
    }

    public static void printCharacter(String character, int numberOfCharacter, boolean withLine){
        for(int i = 0; i < numberOfCharacter; i++){
            if(withLine && (i == numberOfCharacter - 1)){
                System.out.println(character);
            }else{
                System.out.print(character);
            }
        }
    }
}
