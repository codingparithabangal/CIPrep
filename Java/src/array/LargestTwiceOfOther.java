package array;

/**
 * 
 * Problem #747
 * 
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 * 
 * Example 1:
 * Input: nums = [3, 6, 1, 0]
 * Output: 1
 * Explanation: 6 is the largest integer, and for every other number in the array x,
 * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
 */

public class LargestTwiceOfOther {

   public static int dominantIndex(int[] nums) {
      int max = Integer.MIN_VALUE;
      int max_2 = Integer.MIN_VALUE;
      int position = 0;
      for (int index = 0; index < nums.length; index++) {
         if (nums[index] > max) {
            max_2 = max;
            max = nums[index];
            position = index;
            continue;
         } else if (nums[index] > max_2) {
            max_2 = nums[index];
         }
      }
      if (max - max_2 >= max_2 || nums.length == 1) {
         return position;
      } else {
         return -1;
      }
   }

   public static void main(String[] args) {
      int[] array = { 1, 2, 3, 6 };
      System.out.println("Largest number twice greater than others is at index " + dominantIndex(array));

   }
}
