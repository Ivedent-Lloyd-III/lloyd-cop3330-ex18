package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 18
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        String userInput = in.nextLine();

        System.out.println("Your choice: "+userInput+"");

        if (userInput.equals("C") || userInput.equals("c")){

            int tempFahrenheit = inputFahrenheit();

            int C = ((tempFahrenheit - 32) * 5 / 9);

            System.out.print("The temperature in Celsius is "+C+".");

        }

        else if(userInput.equals("F") || userInput.equals("f")){

            int tempCelsius = inputCelsius();

            int F = ((tempCelsius * 9 / 5) + 32);

            System.out.print("The temperature in Fahrenheit is "+F+".");

        }

    }

    private static int inputCelsius() {

        System.out.print("Please enter the temperature in Celsius: ");
        int inputCelsius = in.nextInt();

        return inputCelsius;

    }

    private static int inputFahrenheit() {

        System.out.print("Please enter the temperature in Fahrenheit: ");
        int inputFahrenheit = in.nextInt();

        return inputFahrenheit;

    }

}
