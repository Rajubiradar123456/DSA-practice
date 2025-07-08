// Most Frequent Number Following Key (EASY)
// You are given an integer ArrayList nums.
// You are also given an integer key, which is guaranteed to be present in nums.

// For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums.

// In other words, count the number of indices i such that:

// 0 <= i <= nums.size() - 2,

// nums.get(i) == key, and

// nums.get(i + 1) == target.

// Return the target with the maximum count.

// (Assume that the target with the maximum count is unique.)

// Sample Input 1:
// ini
// Copy
// Edit
// nums = [1, 100, 200, 1, 100], key = 1
// Sample Output 1:
// Copy
// Edit
// 100
// Explanation:

// For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.

// No other integers follow an occurrence of key.
// Hence, we return 100.

// Sample Input 2:
// ini
// Copy
// Edit
// nums = [2, 2, 2, 2, 3], key = 2
// Sample Output 2:
// Copy
// Edit
// 2
// Explanation:

// For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.

// For target = 3, there is only 1 occurrence at index 4 which follows an occurrence of key.
// target = 2 has the maximum number of occurrences following an occurrence of key, so we return 2.



import java.util.*;



public class ArrayListpractice3 {

    public int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1001]; // Assuming numbers are in the range [0, 1000]

        // Count occurrences of numbers that follow 'key'
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1)]++;
            }
        }

        int maxCount = Integer.MIN_VALUE;
        int ans = -1;

        // Find the number with the highest count
        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxCount) {
                maxCount = result[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
       ArrayListpractice3 obj = new ArrayListpractice3();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        int key = 1;

        System.out.println(obj.mostFrequent(nums, key)); // Output: 100
    }
}


