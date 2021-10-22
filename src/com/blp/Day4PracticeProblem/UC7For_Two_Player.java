package com.blp.Day4PracticeProblem;

public class UC7For_Two_Player {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game ");
        System.out.println("\n");

        int position = 0;
        int count = 0;
        int position1=0;
        int count1=0;


        while(position<=99 )
        {

            int die = (int) (Math.random()*10)%6+1;
            int die1= (int) (Math.random()*10)%6+1;
            position = (position+die);
            position = (position1+die1);
            count = (count+1);
            count1= (count1+1);
            int check = (int) (Math.random()*10)%3+1;
            int check1 = (int) (Math.random()*10)%3+1;

            System.out.println("########################");
            // for player one
            switch(check)
            {
                case 1:
                    System.out.println("No play Player 1 is in Same position ");
                    System.out.println("\n");

                    break;
                case 2:
                    position=(position+die);
                    if(position > 100)
                    {
                        position=(position-die);
                        continue;
                    }
                    else if(position<0)
                    {
                        position=0;
                    }
                    System.out.println("Value of die rolled player 1: "+die);
                    System.out.println("Player 1 position after ladder is: "+position);
                    System.out.println("\n");

                    break;
                case 3:
                    position = (position-die);
                    if(position < 0)
                    {
                        position = 0;
                        continue;
                    }
                    else if(position>100)
                    {
                        position=(position-die);
                    }
                    System.out.println("Value of die rolled for player 1: "+die);
                    System.out.println("player 1 position after snake is: "+position);
                    System.out.println("\n");

                    break;
            }

            System.out.println("=======================================");
            //for player 2
            switch(check1)
            {
                case 1:
                    System.out.println("No play Player 2 is in Same position ");
                    System.out.println("\n");
                    break;
                case 2:
                    position1=(position1+die1);
                    if(position1 > 100)
                    {
                        position1=(position1-die1);
                        continue;
                    }
                    else if(position1<0)
                    {
                        position1=0;
                    }
                    System.out.println("Value of die rolled for player 2: "+die1);
                    System.out.println("Player 2 position after ladder is: "+position1);
                    System.out.println("\n");

                    break;
                case 3:
                    position1 = (position1-die1);
                    if(position1 < 0)
                    {
                        position1 = 0;
                        continue;
                    }
                    else if(position>100)
                    {
                        position1=(position1-die1);
                    }
                    System.out.println("Value of die rolled for player 2: "+die1);
                    System.out.println("player 2 position after snake is: "+position1);
                    System.out.println("\n");

                    break;

            }

        }

        if(position1 == 100)
        {
            System.out.println("Player 2 Wins The game!!! ");
            System.out.println("Number of dies rolled by player 2: "+count1);
        }
        else
        {
            System.out.println("Player 1 Wins The game!!! ");
            System.out.println("Number of dies rolled player 1: "+count);
        }


    }

}



