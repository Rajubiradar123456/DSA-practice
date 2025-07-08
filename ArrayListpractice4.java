// Beautiful ArrayList
// An ArrayList nums of size n is said to be beautiful if:

// nums is a permutation of the integers in the range [1, n].

// For every 0 <= i < j < n, there is no index k such that i < k < j and:

// csharp
// Copy
// Edit
// 2 * nums.get(k) == nums.get(i) + nums.get(j)
// Given an integer n, return any beautiful ArrayList nums of size n.
// There will be at least one valid answer for every given n.

// 📝 Sample Input 1:
// ini
// Copy
// Edit
// n = 4
// ✅ Sample Output 1:
// csharp
// Copy
// Edit
// [2, 1, 4, 3]
// 📝 Sample Input 2:
// ini
// Copy
// Edit
// n = 5
// ✅ Sample Output 2:
// csharp
// Copy
// Edit
// [3, 1, 2, 5, 4]


import java.util.*;

public class ArrayListpractice4 {

    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // Add odd numbers first
            for (Integer e : ans) {
                if (e * 2 - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }

            // Add even numbers next
            for (Integer e : ans) {
                if (e * 2 <= n) {
                    temp.add(e * 2);
                }
            }

            ans = temp;
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayListpractice4 obj = new ArrayListpractice4();
        System.out.println(obj.beautifulArray(4)); // Example output: [1, 3, 2, 4]
        System.out.println(obj.beautifulArray(5)); // Example output: [1, 3, 5, 2, 4]
    }
}

