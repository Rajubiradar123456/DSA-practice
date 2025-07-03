// // Question 2 :You are given a number (eg -  2019), convert it into a String of english
//  like“two zero one nine”.  
//  Use a recursive function to solve this problem.
// NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
// Sample Input: 1947Sample Output: “one nine four seven


public class Recursion9 {
    // Array to map digits to their string equivalents
    static String digits[] = {
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"
    };

    // Recursive function to print the digits of a number in words
    public static void printDigits(int number) {
        // Base case: if the number becomes 0, stop recursion
        if (number == 0) {
            return;
        }
        // Get the last digit of the number
        int lastDigit = number % 10;
        // Recursively call for the number without the last digit
        printDigits(number / 10);
        // Print the corresponding word for the last digit
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        // Example number to be converted to words
        int number = 1234;
        printDigits(number);
    }
}
