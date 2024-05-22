// Author: Justine Stroup
// Date: 05/21/2024
// Leetcode TwoSum.java
// Runtime: 49 ms

/*
 * Given an array of integers nums and an integer target, return the indices
 * of the two numbers such that they add up to target. This program assumes
 * that each input would have exactly one solution, and the same element twie
 * may not be used.
 */

 // Used for importing the Arrays.toString() method
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // Example array
        int[] num1 = {2, 5, 5, 11};

        // Example target number
        int target = 10;

        // Array placeholder
        int[] array = {0, 0};

        // Call twoSumMethod to find two elements that add up to target
        array = twoSumMethod(num1, target);

        // Display the indices of the two numbers that add up to target
        System.out.println(Arrays.toString(array));
    }
    public static int[] twoSumMethod(int[] nums, int target) {
        int key = target;

        // Array placeholder
        int[] indicesArray = {0, 0};

        // Iterate through each number for num1
        for (int i = 0; i < nums.length; i++) {
            System.out.println("");

            // Store comparison number
            int tempIElement = nums[i];

            // For loop to check other numbers in array
            for (int j = i + 1; j < nums.length; j++) {

                // Store 2nd comparison number
                int tempJElement = nums[j];
                
                // If num 1 + num 2 == target
                if (key - tempJElement == tempIElement) {
                    indicesArray[0] = i;
                    indicesArray[1] = j;
                    // Return indices if elements add up to target
                    return indicesArray;
                }
            }
        }
            // Return {0, 0} if no elements add up to target
            return indicesArray;  
    }
}