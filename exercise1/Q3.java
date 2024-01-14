// Write a program that reverses the words inside a sentence. Any punctuation mark can be
// treated as part of a word. You can also assume that there is a single space between any two consecutive words,
// and there is no extra space in the beginning or the end of the sentence.

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println(reversed.toString());
    }
}