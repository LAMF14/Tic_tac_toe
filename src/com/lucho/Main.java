package com.lucho;

import java.util.Scanner;

public class Main {
    public static char[][] tablero = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    public static char x = 'X';
    public static char p = '1';

    public static void main(String[] args) {
        short i = 0;
        grafica();







    }
   public static void grafica(){
       System.out.print("\033[H\033[2J");
       System.out.flush();
        System.out.println("\n");
        System.out.println("                    Tic Tac Toe\n");
        System.out.println("     Player 1 (X)                 Player 2 (0)\n");
        System.out.println("                |                  |");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("      "+tablero[i][j]+"      ");
                if(j<2){
                    System.out.print("   |  ");
                }
            }
            System.out.print("\n");
            if (i<2){
                System.out.println("----------------+------------------+--------------");
            }
        }
       System.out.println("                |                  |");

    }

    public static void juego (){
        System.out.println("PLAYER "+ p + "("+x+"), ENTER A NUMBER: ");
        Scanner entrada = new Scanner(System.in);



    }




















}
