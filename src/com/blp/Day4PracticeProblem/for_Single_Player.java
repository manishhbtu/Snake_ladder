package com.blp.Day4PracticeProblem;
import java.util.Scanner;

public class for_Single_Player {
    public static void main(String[] args) {
        int position = 1;
        int count = 0;


        while (position <= 99) {

            int die = (int) (Math.random() * 10) % 6 + 1;
            count = (count + 1);
            int check = (int) (Math.random() * 10) % 3 + 1;

            switch (check) {
                case 0:
                    System.out.println("No play Player is in Same position ");
                    System.out.println("\n");

                    break;
                case 1:
                    position = (position + die);
                    if (position > 100) {
                        position = (position - die);
                        continue;
                    } else if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Value of die rolled " + die);
                    System.out.println("Player position after ladder is: " + position);
                    System.out.println("\n");

                    break;
                case 2:
                    position = (position - die);
                    if (position < 0) {
                        position = 0;
                        continue;
                    } else if (position > 100) {
                        position = (position - die);
                    }
                    System.out.println("Value of die rolled " + die);
                    System.out.println("player position after snake is: " + position);
                    System.out.println("\n");


            }
        }
        if (position == 100) {
            System.out.println("Player Win The game!!! ");
            System.out.println("Number of dies rolled: " + count);

        }
    }
}