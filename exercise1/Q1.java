// Implement the method sumOfDigits that returns the sum of all the digits of that number. 
// For example, sumOfDigits(123) returns 6 (1 + 2 + 3). For negative numbers, the sum is the 
// same value as that for a positive number. For example, sumOfDigits(-354) returns 12 (3 + 5 + 4).

public class Q1 {

    public static int sumOfDigits(int number) {
        number = Math.abs(number);
        String numberStr = Integer.toString(number);
        int sum = 0;
        
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
