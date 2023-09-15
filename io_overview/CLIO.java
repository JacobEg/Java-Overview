//package io_overview;

import java.util.Random;
import java.util.Scanner;

public class CLIO {
    public static void main(String[] args){
        System.out.println("Command-line args\n-----------");
        int total = 0;
        for(int i = 0; i < args.length; i++){
            total += Integer.parseInt(args[i]);
        }
        System.out.println(total + 
        " is the sum of the nums you entered.");


        Scanner in = new Scanner(System.in);
        System.out.println(
            "------------\nstdin\n---------------"
        );
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println(
            "Hello " + name + "! Guess a number between [1, 10]"
        );
        Random rand = new Random();
        int randNum = rand.nextInt(11);
        int num;
        while(true){
            num = in.nextInt();
            if(num == randNum){
                System.out.println("Correct!");
                break;
            } else if (num < randNum){
                System.out.println("Too low!");
            } else{
                System.out.println("Too high");
            }
        }
        in.close();
    }
}
