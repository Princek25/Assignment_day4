package com.bridgelabz;
import java.util.Random;

public class Snake_and_Ladder {
    static int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        System.out.println("Start Position : "+ position);
        int dieNum = dieRoll();
        System.out.println("Die Number : "+ dieNum);

    }
    private static int dieRoll(){
        Random num = new Random();
        int dieNum = num.nextInt();
        return dieNum;
    }
}
