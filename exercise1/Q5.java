// Write code that contains only 1 “for” loop to produce each of the following outputs. 
// java Q5
// Enter size:3
// a b c
// java Q5
// Enter size:27
// a b c d e f g h i j k l m n o p q r s t u v w y x z a

import static java.lang.System.in;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.close();

        // Part A
        for (int i = 0; i < size; i++){
            char letter = (char)('a' + i % 26); // 'a' is 97, 'b' is 98, 'c' is 99, etc.
            System.out.print((letter + " "));
        }

        // Part B
        // Expected output for size = 3 is: 123 234 345
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i + j);
            }
        }

        // Part C Expected output for size = 3 is: 
        // 1
        // 12
        // 123
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}