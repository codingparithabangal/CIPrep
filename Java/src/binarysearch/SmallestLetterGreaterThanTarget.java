package binarysearch;

/**
 * Problem #744
 * 
 * Given a list of sorted characters letters containing only lowercase letters, 
 * and given a target letter target, find the smallest element in the list that is larger than the given target.
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 * 
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 *
 */
public class SmallestLetterGreaterThanTarget {
   public static char nextGreatestLetter(char[] a, char x) {
      int n = a.length;
      int lo = 0, hi = n;
      while (lo < hi) {
         int mid = lo + (hi - lo) / 2;
         if (a[mid] > x) {
            hi = mid;
         } else {
            lo = mid + 1;
         }
      }
      return a[lo % n];
   }

   public static void main(String[] args) {
      char[] letters = { 'c', 'f', 'g' };
      System.out.println("Next letter if target is 'a' = " + nextGreatestLetter(letters, 'a'));
      System.out.println("Next letter if target is 'k' = " + nextGreatestLetter(letters, 'k'));
      System.out.println("Next letter if target is 'd' = " + nextGreatestLetter(letters, 'd'));
   }
}
