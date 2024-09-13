
/**
 * Celsius to Fahrenheit calculator
 *
 * KATE
 * v.709273
 */

import java.util.Scanner;

public class Calculators
{
    public static void main (String [] args) {
        Scanner hello = new Scanner (System.in);
        
        int x = 6;
        System.out.println (++x);
        
        System.out.println ("**This is the main menu**");
        System.out.println ("To access the Celsius to Fahrenheit calculator, press 1");
        System.out.println ("To access the BMI calculator, press 2");
        System.out.println ("To access the 'days to weeks' calculator, press 3");
        System.out.println ("To access the receipt generator, press 4");
        System.out.println ("To access the sum of digits calculator, press 5");
        
        int menu = hello.nextInt();
        
        
        if (menu == 1) {
        
        System.out.println ("**Celsius to Fahrenheit calculator**");
        System.out.println ("Type in the temperature in Celsius you wish to convert");
        
        int celsius = hello.nextInt();
        int fahrenheit = celsius * 9/5 + 32;
        
        System.out.println (celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
    } if (menu == 2) {
        
        System.out.println ("**BMI calculator**");
        System.out.println ("First enter your weight in kilograms");
        double weight = hello.nextDouble();
        System.out.println ("Now enter your height in metres");
        double height = hello.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.println ("Your BMI is " + bmi);
    } if (menu == 3) {
        
        System.out.println ("**Days to weeks calculator**");
        System.out.println ("Enter the number of days you wish to convert");
        int days = hello.nextInt();
        
        int weeks = days / 7;
        int rdays = days % 7;
        
        String outputWeeks;
        String outputDays;
        String inputDays;
        
        if (weeks == 1) {outputWeeks = " week"; } else {outputWeeks = " weeks"; }
        if (rdays == 1) {outputDays = " day"; } else {outputDays = " days"; }
        if (days == 1) {inputDays = " day"; } else {inputDays = " days"; }
        System.out.println (days + inputDays + " converts to " + weeks + outputWeeks + " and " + rdays + outputDays);
    
    } if (menu == 4) {
        
        System.out.println ("**Receipt Generator**");
        
        System.out.println ("Enter the quantity of items");
        int quantity = hello.nextInt();
        
        System.out.println ("Enter the item's individual price");
        double price = hello.nextDouble();
        
        System.out.println ("Enter the tax rate");
        double tax = hello.nextDouble();
        
        double output;
        output = (quantity * price) + ((quantity * price) * (tax/100));
        System.out.println ("The post tax amount is " + output);
        
    } if (menu == 5) {
        
        System.out.println ("**Sum of digits calculator**");
        System.out.println ("Enter a three digit number");
        int number = hello.nextInt ();
        int digit1 = (int) number / 100;
        int digit2 = (int) (number - (digit1 * 100)) / 10;
        int digit3 = (int) (number - (digit1 * 100) - (digit2 * 10));
        
        int result = digit1 + digit2 + digit3;
        
        System.out.println ("The sum of the digits is " + result);
    }
        
    }
}
