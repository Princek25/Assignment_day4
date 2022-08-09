package com.bridgelabz;
import java.util.Random;

public class Snake_and_Ladder {
    static int position = 0;
    static int roll=0;
    static int snake = 1;
    static int ladder = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        System.out.println("Start Position : "+ position);
        while (position!=100) {

            int dieNum = dieRoll();
            System.out.println("Die Number : " + dieNum);
            action(dieNum);
            System.out.println("Die Number : " + position);
        }
        System.out.println("Roll Die: "+roll);
    }
    private static void action(int dieNum){
        int option = (int) (Math.random() * 10) % 3;
        switch (option){
            case ladder :
                System.out.println("It is ladder");
                if (position+dieNum<=100)
                    position+=dieNum;
                break;
            case snake :
                System.out.println("It is Snake");
                position+=dieNum;
                break;
                if (position<0)
                    position=0;
                break;
            default:
                System.out.println("No Play");
        }

    }

    private static int dieRoll(){
        Random num = new Random();
        int dieNum = num.nextInt();
        return dieNum;
    }
}
