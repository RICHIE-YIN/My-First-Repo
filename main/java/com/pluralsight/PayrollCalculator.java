package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How much hours did you work");
        float hoursWorked = scanner.nextFloat();
        System.out.println("What's your pay rate?");
        float payRate = scanner.nextFloat();
        float totalPay;
        if(hoursWorked > 40) {
            int newHours = (int) (hoursWorked - 40);
            float overtimePay = (float) (newHours * payRate * 1.5);
            float regularPay = (float) (payRate * 40);
             totalPay = (float) (regularPay + overtimePay);
        } else {
             totalPay = (hoursWorked * payRate);
        }
        System.out.println(name + ", your gross pay is $" + totalPay);
    }
}
