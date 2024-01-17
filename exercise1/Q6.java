// You need to implement a static method that attempts to align two strings. This method takes 
// in two parameters which are both of type String. Let’s call the first parameter str1 and the second str2. You 
// can assume that str1 is longer than or of the same length as str2. The method should try to align str2 with 
// str1 and insert spaces for additional characters in str1. In the end the method returns true if there is an 
// alignment, and meanwhile the method prints out the alignment. If no alignment can be found, the method 
// returns false and prints out nothing. 
// An alignment between str1 and str2 means by inserting spaces into str2, each character in str2
// (excluding the inserted spaces) can be matched in str1 in the same position. For example, if str1 is
// "Recess Week" and str2 is "RcWk", then we can align str2 to str1 as follows:
// Recess Week
// R c    W  k

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        StringBuilder alignment = new StringBuilder();
        int j = 0; // index of str2
        for (int i = 0; i < str1.length(); i++) {
            if (j < str2.length() && str1.charAt(i) == str2.charAt(j)) {
                alignment.append(str2.charAt(j));
                j++;
            } else {
                alignment.append(' ');
            }
        }
        if (j == str2.length()) {
            System.out.println(str1);
            System.out.println(alignment.toString());
            return true;
        } else {
            return false;
        }
    }
}
