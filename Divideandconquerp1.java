// Question 2 :Given an array nums of size n, returnthe majority element. (MEDIUM)
// The majority element is the element thata ppears more than ⌊n/2⌋ times.
// Youmayassumethat the majority element always exists in the array.
// Sample Input 1: nums = [3,2,3]Sample Output 1: 
// 3Sample Input 2: nums = [2,2,1,1,1,2,2]Sample Output 2: 2



// The majority element is the element thata ppears more than ⌊n/2⌋ times.
public class Divideandconquerp1 {
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > majorityCount) {
                return nums[i];
            }
        }

        return -1; // Should not reach here if a majority element is guaranteed
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element is: " + majorityElement(nums));
    }
}
