package com.bridgelabz;

public class Snake_Ladder {
    public static void main(String[] args) {
        System.out.println(" welcome to snake ladder ");
        int player[]=new int[2];
        player[0]=0;
        player[1]=0;
        System.out.println("sarting position of player1"+player[0]);
        System.out.println("Starting position of player2"+player[1]);
        System.out.println(player[1]);
        int position=0;
        System.out.println("Game Begins");
        System.out.println("position 4,14,18,58 are ladders");
        System.out.println("position 10,25,38,48 99 are snakes");
        player[position]+=(int)(Math.random()*10)%6+1;
        System.out.println(player[position]);
    }
}
