package org.example;

import java.util.Scanner;

public class Main {
    public static int calculateYearsUntil100(int currentAge){
        return 100-currentAge;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int userNum = input.nextInt();
        int ageLeft = calculateYearsUntil100(userNum);

        System.out.println("You have " + ageLeft + " years left until you turn 100 years old.");
        input.close();
    }
}