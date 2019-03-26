package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*input number*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = scan.nextInt();
        int bonusPoints = 0;

        if (number % 2 == 0){
            bonusPoints = 1;
        }else if(number % 5 == 0){
            bonusPoints = 2;
        }

        if (number <= 100){
            bonusPoints += 5;
        }else if (number > 100 && number <1000){
            bonusPoints += number * 0.2;
        }else if(number > 1000){
            bonusPoints += number * 0.1;
        }
        System.out.printf("Bonus points: %d%n",bonusPoints);
        System.out.printf("Number + bonus points = %d%n", (number+bonusPoints));
    }
}
