import static java.lang.System.out;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String c = "h";
        String d = "h";

        if (c == d) {
            System.out.println("c and d are equal");
        }
        else {
            System.out.println("c and d are not equal");
        }

        String str = "";
        out.println("The length of str is: " + str.length()); // Don't need System.out.println()

        // Printing in same line
        out.print("1");
        out.print("2");

        // Printing in new line
        out.println("1");
        out.println("2");

        // Scanner
        Scanner scan = new Scanner(System.in);
        out.println("Please input strings: ");

        while(scan.hasNext()) { // hasNext() returns true if there is more input
            String str1 = scan.next(); // next() returns the next token
            String str2 = scan.nextLine(); // nextLine() returns the next line


            if (str1.equals("esc")) {
                break;
            }

            out.println("The input string is: " + str1);
        }
        scan.close(); // Close the scanner

    }
}