package com.company;

public class Main {

    public static void main(String[] args)  {
        System.out.println("Jello!");

        int addNumber = 100;
        addNumber = addNumber + 100;
        addNumber += 100; // Line 10 and Line 9 do the same thing not numerically but formula wise.

        int minusNumber = 500;
        minusNumber = minusNumber - 100;
        minusNumber -= 100; // Line 14 and Line 13 do the same thing not numerically but formula wise.

        int multiNumber = 100;
        multiNumber = multiNumber * 100;
        multiNumber *= 100; // Line 18 and Line 17 do the same thing not numerically but formula wise.

        int divNumber = 10000;
        divNumber = divNumber / 100;
        divNumber /= 100; // Line 22 and Line 21 do the same thing not numerically but formula wise.

        System.out.println("Add: " + addNumber);
        System.out.println("Sub: " + minusNumber);
        System.out.println("Multiply: " + multiNumber);
        System.out.println("Division: " + divNumber);

        int interation = 1;
        interation++; //takes the iteration variable and adds 1 to it.
        interation--; //takes the iteration variable and subtracts 1 from it.

        int mod = 10;
        mod = mod % 3;
        System.out.println("Mod: " + mod);
    }
}