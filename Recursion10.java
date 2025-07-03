// Write a program to findLength of aStringusing Recursion

public class Recursion10 {
    public static int length(String str) {
        // Base case: if the string is empty, its length is 0
        if (str.length() == 0) {
            return 0;
        }
        // Recursive case: reduce the string by removing the first character
        // and add 1 to the length
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abb"; // Example string
        System.out.println(length(str)); // Print the length of the string
    }
}
