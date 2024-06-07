package com.example.exercise1number_multiple;
import java.util.*;
public class HelloApplication{
    public static void main(String[] args) {
        //Daniel Caizatoa
        for (int i=1 ; i <= 100 ; i++ ){
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}