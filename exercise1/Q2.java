// Write a program that repeatedly prompts the user for two words. It then checks whether the
// first character of the two words (assume case sensitive) are the same. If they are the same, 
// the program displays "bingo" and terminates the program. Otherwise it displays "try again" 
// and prompts for inputs again from the user

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1, input2;

        do {
            System.out.print("Enter first word:");
            input1 = sc.nextLine();
            System.out.print("Enter second word:");
            input2 = sc.nextLine();

            // If first character in input1 and input2 are same, print same
            if (input1.charAt(0) == input2.charAt(0)) {
                System.out.println("Bingo");
                sc.close();
            }
            else {
                System.out.println("Try again");
            }
        }
        while (input1.charAt(0) != input2.charAt(0));
    }

}