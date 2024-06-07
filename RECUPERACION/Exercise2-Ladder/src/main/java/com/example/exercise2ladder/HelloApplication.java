package com.example.exercise2ladder;

import java.util.*;
public class HelloApplication {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number for the ladder: ");
        int ladder = number.nextInt();
        if (ladder < 0){
            ladder = ladder * -1;
            for (int i=0; i<= ladder; i++){
                System.out.println("|_");
                for (int j=0; j<=i; j++){
                    System.out.print("  ");
                }
            }
        }else if(ladder > 0){
            for(int i=ladder; i>=0; i--){
                for(int j=0; j<=i; j++){
                    System.out.print("  ");
                }
                System.out.println("_|");
            }
            System.out.println("_|");
        }else {
            System.out.println("__");
        }
    }
}
