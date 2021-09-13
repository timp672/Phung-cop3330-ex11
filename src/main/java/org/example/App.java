/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.math.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.println("How many euros are you exchanging? ");
        String strEuros = scan.nextLine();
        System.out.println("What is the exchane rate? ");
        String strExRate = scan.nextLine();

        //processing
        double euros = Double.parseDouble(strEuros);
        double exRate = Double.parseDouble(strExRate);

        double US = euros * exRate;

        BigDecimal bd = new BigDecimal(US).setScale(2, RoundingMode.HALF_UP);
        double convert = bd.doubleValue();

        //Output
        System.out.println(strEuros+" euros at an exchange rate of "+strExRate+" is "+convert+" U.S. dollars.");

    }
}
