// Monotonic ArrayList (EASY)

// An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.

// An ArrayList nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j).

// An ArrayList nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

// Given an integer ArrayList nums, return true if the given list is monotonic, or false otherwise.

// Sample Input 1:
// nums = [1, 2, 2, 3]
// Sample Output 1:
// true

// Sample Input 2:
// nums = [6, 5, 4, 4]
// Sample Output 2:
// true

// Sample Input 3:
// nums = [1, 3, 2]
// Sample Output 3:
// false

import java.util.ArrayList;

public class ArrayListpractice1 {
    public boolean isMonotonic(ArrayList<Integer> A) {
    boolean inc = true;
    boolean dec = true;

    for (int i = 0; i < A.size() - 1; i++) {
        if (A.get(i) > A.get(i + 1)) {
            inc = false;
        }
        if (A.get(i) < A.get(i + 1)) {
            dec = false;
        }
    }

    return inc || dec;
}
public static void main(String[] args) {
    ArrayList<Integer> A=new ArrayList<>();
    A.add(1);
    A.add(2);
    A.add(2);
    A.add(3);
     ArrayListpractice1 obj = new ArrayListpractice1();
        System.out.println(obj.isMonotonic(A));
    
}

}
