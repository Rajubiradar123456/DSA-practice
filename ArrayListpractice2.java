
// Lonely Numbers in ArrayList (MEDIUM)
// You are given an integer ArrayList nums.

// A number x is lonely when:

// It appears exactly once in nums, and

// Neither of its adjacent numbers (x + 1 and x - 1) appear in nums.

// Return all lonely numbers in nums. You may return the answer in any order.

// Sample Input 1:
// nums = [10, 6, 5, 8]

// Sample Output 1:
// [10, 8]

// Explanation:

// 10 is a lonely number because it appears exactly once, and neither 9 nor 11 appear in nums.

// 8 is a lonely number because it appears exactly once, and neither 7 nor 9 appear in nums.

// 5 is not a lonely number because 6 appears in nums.

// 6 is not a lonely number because 5 appears in nums.

// Hence, the lonely numbers in nums are [10, 8].
// (Note: [8, 10] may also be a valid output.)

// Sample Input 2:
// nums = [1, 3, 5, 3]

// Sample Output 2:
// [1, 5]

// Explanation:

// 1 is a lonely number because it appears exactly once, and neither 0 nor 2 appear in nums.

// 5 is a lonely number because it appears exactly once, and neither 4 nor 6 appear in nums.

// 3 is not a lonely number because it appears twice.

// Hence, the lonely numbers in nums are [1, 5].
// (Note: [5, 1] may also be a valid output.)



import java.util.*;

import java.util.*;

public class ArrayListpractice2 {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums); // Sort the list
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.size() - 1; i++) {
            // Check if current number is unique and has no adjacent neighbors
            if (nums.get(i - 1) != nums.get(i) && nums.get(i) != nums.get(i + 1)
                    && nums.get(i - 1) + 1 < nums.get(i)
                    && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        if (nums.size() == 1) {
            list.add(nums.get(0));
        }

        if (nums.size() > 1) {
            // Check for first element
            if (nums.get(0) != nums.get(1) && nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }

            // Check for last element
            if (nums.get(nums.size() - 2) != nums.get(nums.size() - 1)
                    && nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayListpractice2 obj = new ArrayListpractice2();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(obj.findLonely(nums)); // Output: [10, 8]
    }
}
