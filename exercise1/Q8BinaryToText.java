// Write a program called Q8BinaryToText which takes in a binary message 
// and prints out the textual representation.

import java.util.*;

public class Q8BinaryToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary message: ");
        String binary = scanner.nextLine();
        String text = "";
        for (int i = 0; i < binary.length(); i += 8) {
            text += (char) Integer.parseInt(binary.substring(i, i + 8), 2);
        }
        System.out.println("The text message is: " + text);
        scanner.close();
    }
}