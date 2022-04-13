package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Racer = new String[5];
        int[] lap1 = new int[5];
        int[] lap2 = new int[5];

        for (int i = 0; i < Racer.length; i++) {
            System.out.print("Enter racer's name: ");
            Racer[i] = input.next();

            System.out.print("Enter time taken for lap 1 (sec): ");
            lap1[i] = input.nextInt();

            System.out.print("Enter time taken for lap 2 (sec): ");
            lap2[i] = input.nextInt();

            System.out.println();
        }

        //FIND LOWEST / WINNER
        int minsec = lap1[0];
        int minsec2 = lap2[0];
        String winnername = Racer[0];
        for (int i = 1; i < Racer.length; i++) {
            if (lap1[i] < minsec) {
                minsec = lap1[i];
                winnername = Racer[i];
            }

            if (lap2[i] < minsec2) {
                minsec2 = lap2[i];
                winnername = Racer[i];
            }
        }
        
        int finalsec = 0;
        if(minsec < minsec2){
            finalsec = minsec;
        }else{
            finalsec = minsec2;
        }
        
        System.out.println("Winner = " + winnername);
        System.out.println("Best Time(in sec) = " + finalsec);
    }
}
