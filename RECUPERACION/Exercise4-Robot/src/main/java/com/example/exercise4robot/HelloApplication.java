package com.example.exercise4robot;
import java.util.*;

public class HelloApplication {
    public static void main(String[] args) {
            int [] Robot ={-10, -5, 2};
            int LocationX = 0;
            int LocationY = 0;
            boolean PositiveSymbolX = false;
            boolean PositiveSymbolY = true;

            for (int i=0 ; i<=Robot.length-1 ; i++){
                if (i % 2 == 0) {
                    if (PositiveSymbolY){
                        LocationY = (LocationY - Robot[i]);
                        PositiveSymbolY = false;
                    } else {
                        LocationY = (LocationY + Robot[i]);
                        PositiveSymbolY = true;
                    }
                } else {
                    if (PositiveSymbolX){
                        LocationX = (LocationX - Robot[i]);
                        PositiveSymbolX = false;
                    } else {
                        LocationX = (LocationX + Robot[i]);
                        PositiveSymbolX = true;
                    }
                }
            }
            System.out.println("( " + LocationX + ", " + LocationY + " )");
        }
    }
