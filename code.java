package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String NAME = input.next();
        System.out.println("WELCOME TO THE GAME " + NAME + " ...");
        System.out.println("ENTER ANY NUMBER TO START...");
        int num1 = input.nextInt();
        System.out.println("PRESS 911 FOR INSTRUCTIONS//");
        int num2 = input.nextInt();
        if (num2 == 911) {
            System.out.println("1.THIS IS JUST FOR FUN " + NAME);
            System.out.println("2.IMAGINE MAP IN YOUR MIND");
            System.out.println("3.PLAY CAREFULLY " + NAME);
        } else {
            System.out.println("PRESS CORRECT NUMBER " + NAME);
        }
        System.out.println("INSTRUCTIONS ARE BELOW:");
        System.out.println("6.TAKE RIGHT\n4.TAKE LEFT\n2.REVERSE\n8.FORWARD\n5.STOP\n0.HORN");
        int num4;
        for (num4 = 0; num4 < 10000000; num4++)
        {
            int num3 = input.nextInt();

                if (num3 ==6)
                {
                    System.out.println("TAKEN RIGHT");
                } else if (num3 == 8)
                {
                    System.out.println("MOVING FORWARD");
                }
                else if (num3 == 4)
                {
                    System.out.println("TAKEN LEFT");
                }
                else if (num3 == 2)
                {
                    System.out.println("TAKING REVERSE");
                    System.out.println("GOOD TO GO");
                }
                else if (num3 == 5)
                {
                    System.out.println("STOPPING");
                    System.out.println("UFF .." + "STOPPED AT LAST");
                }
                else if (num3==0)
                {
                    System.out.println("BEEP");
                }
                 else
                {
                    System.out.println("enter correct number mate!!!");
                    break;
                }



            /*switch (num3) {
                case 6:
                    System.out.println("TAKEN RIGHT");
                    break;
                case 4:
                    System.out.println("TAKEN LEFT");
                    break;
                case 2:
                    System.out.println("TAKING REVERSE");
                    break;
                case 8:
                    System.out.println("MOVING ON");
                    break;
                case 5:
                    System.out.println("STOPPED");
                    break;
                case 0:
                    System.out.println("BEEP");
                    break;
                default:
                    System.out.println("ENTER THE CORRECT NUMBER MATE!!!");
                    break;*/
            //}
        }
    }
}
