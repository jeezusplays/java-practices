// Write a program called Q8TextToBinary.java that takes any textual message and prints 
// out its binary equivalent. Write a similar program called Q8BinaryToText which takes in a binary message 
// and prints out the textual representation.

import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text message: ");
        String text = scanner.nextLine();
        String binary = "";
        for (int i = 0; i < text.length(); i++) {
            binary += Integer.toBinaryString((int) text.charAt(i));
        }
        System.out.println("The binary equivalent of the text message is: " + binary);
        scanner.close();
    }
}