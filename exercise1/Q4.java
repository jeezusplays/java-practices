// Write a program that repeatedly prompts the user for numbers. Once the user types any number 
// less than zero, this program must terminate and display the product of all non-negative numbers typed.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double product = 1;
        StringBuilder sb = new StringBuilder();
        boolean positive = false;

        do {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number < 0) {
                if(!positive) {
                    System.out.println("No positive number is entered");
                }
                else {
                    sb.setLength(sb.length() - 3); // Remove last " x "
                    sb.append(" = ").append(product);
                    System.out.println(sb.toString());
                }
                sc.close();
                break;
            }
            sb.append(number).append(" x ");
            product *= number;
            positive = true;

        } while (true);

    }
}

