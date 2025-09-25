package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("Enter the first number");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract:");
        System.out.println("(M)ultiply:");
        System.out.println("(D)ivide:");
        System.out.println("(Please select an option:");
        String option = scanner.nextLine();
        if(option.equalsIgnoreCase("a")) {
            answer = num1 + num2;
        } else if(option.equalsIgnoreCase("s")) {
            answer = num1 - num2;
        } else if(option.equalsIgnoreCase("m")) {
            answer = num1 * num2;
        } else if(option.equalsIgnoreCase("d")) {
            answer = num1 / num2;
        }
        System.out.println(num1 + "*" + num2 + "=" + answer);

    }
}
