// Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting and ending with the same character.Sample Input 1: S = "abcab"Sample Output 1: 7There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, bOutoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous substrings start and end with the same character.Sample Input 2: S = "aba"Sample Output 2: 4The substrings are a, b, a and aba.
// count of sustring


public class Recursion11 {
    public static int countSubstrings(String S) {
        int n = S.length();
        int count = 0;
        int i = 0;

        while (i < n) {
            // Count contiguous characters
            int j = i;
            while (j < n && S.charAt(j) == S.charAt(i)) {
                j++;
            }
            // Length of contiguous characters
            int length = j - i;

            // Add substrings count for this group
            count += (length * (length + 1)) / 2;

            // Move to the next group
            i = j;
        }
        return count;
    }

    public static void main(String[] args) {
        String S = "abcab";
        System.out.println("Count of substrings: " + countSubstrings(S));
    }
}
