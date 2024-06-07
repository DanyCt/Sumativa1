package com.example.exercise3partitions;

import java.util.*;

public class HelloApplication{
    public static void main(String[] args){
            for (int round = 1; round <= 3; round++) {
                System.out.println("Round " + round + ":");

                boolean Rock = false;
                boolean Scissor = false;
                boolean Paper = false;
                boolean ItemOne = false;

                Scanner player1 = new Scanner(System.in);
                System.out.println("PLAYER #1");
                System.out.println("Enter R(Rock), P(Paper), S(Scissors)");
                String PlayerOne = player1.nextLine();

                Scanner player2 = new Scanner(System.in);
                System.out.println("PLAYER #2");
                System.out.println("Enter R(Rock), P(Paper), S(Scissors)");
                String PlayerTwo = player2.nextLine();

                if (PlayerOne.equalsIgnoreCase("P") && PlayerTwo.equalsIgnoreCase("R")) {
                    Paper = true;
                    ItemOne = true;
                } if (PlayerOne.equalsIgnoreCase("R") && PlayerTwo.equalsIgnoreCase("P")) {
                    Paper = true;
                }if (PlayerOne.equalsIgnoreCase("R") && PlayerTwo.equalsIgnoreCase("S")) {
                    Rock = true;
                    ItemOne = true;
                }if (PlayerOne.equalsIgnoreCase("S") && PlayerTwo.equalsIgnoreCase("R")) {
                    Rock = true;
                }if (PlayerOne.equalsIgnoreCase("S") && PlayerTwo.equalsIgnoreCase("P")) {
                    Scissor = true;
                    ItemOne = true;
                }if (PlayerOne.equalsIgnoreCase("P") && PlayerTwo.equalsIgnoreCase("S")) {
                    Scissor = true;

                }if (Paper || Scissor || Rock) {
                    if (Paper) {
                        if (ItemOne) {
                            System.out.println("Player One Wins--> Paper");
                        } else {
                            System.out.println("Player Two Wins--> Paper");
                        }
                    } else if (Rock) {
                        if (ItemOne) {
                            System.out.println("Player One Wink-->Rock");
                        } else {
                            System.out.println("Player Two Wins-->Rock");
                        }
                    } else {
                        if (ItemOne) {
                            System.out.println("Player One Wins-->Scissors");
                        } else {
                            System.out.println("Player Two Wins-->Scissors");
                        }
                    }
                } else {
                    System.out.println("Enter the letters in uppercase, please.");
                }

                System.out.println();
            }
        }
    }