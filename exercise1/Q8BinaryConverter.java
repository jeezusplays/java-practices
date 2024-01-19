// Counting in binary is similar to counting in any other number system. Beginning with a single 
// digit, counting proceeds through each symbol, in increasing order. Decimal (or base-10) counting uses the 
// symbols 0 through 9, while binary only uses the symbols 0 and 1. Read more about how a decimal number can 
// be converted to its binary equivalent: http://www.wikihow.com/Convert-from-Decimal-to-Binary

// Write a program called Q8BinaryConverter.java that converts a positive integer number to its binary 
// equivalent. You can check if your conversion is correct using your windows' calculator (select “programmer 
// mode”).

import java.util.Scanner;

public class Q8BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number must be positive.");
        } else {
            String binary = Integer.toBinaryString(number);
            System.out.println("The binary equivalent of " + number + " is: " + binary);
        }
        scanner.close();
    }
}