package com.pluralsight;

import java.util.Scanner;

public class ScannerExcercise {

//    Create a new class called InputExercise
//    You are going to ask the user for the following details and store it in 3 variables:
//    Favorite animal
//    First tool that comes to mind
//    Number of day of birth day
//    You are going to print this in a silly sentence like:
//    You're favorite animal is elephant, first tool that comes to mind is a saw and the 24 is the day you were born.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your fav animal?");
        String animal = scanner.nextLine();
        System.out.println("What's the first tool to come to mind?");
        String tool = scanner.nextLine();
        System.out.println("numbers of days in birthday?");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("You're favorite animal is %s, first tool that comes to mind is %s and the day you were born is %d", animal, tool, days);
    }
}
