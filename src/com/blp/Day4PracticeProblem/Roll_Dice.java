package com.blp.Day4PracticeProblem;

public class Roll_Dice {
    public static void main(String[] args) {
        int position =0;
        System.out.println("position is player="+position);
        int dice=(int) (Math.random()*10+1)%6;
        System.out.println("dice number="+dice);
    }
}
