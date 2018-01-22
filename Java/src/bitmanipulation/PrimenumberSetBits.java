package bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem #762 
 * Given two integers L and R, find the count of numbers in the
 * range [L, R] (inclusive) having a prime number of set bits in their binary
 * representation. (Recall that the number of set bits an integer has is the
 * number of 1s present when written in binary. For example, 21 written in
 * binary is 10101 which has 3 set bits. Also, 1 is not a prime)
 * Input: L = 6, R = 10
 * Output: 4
 * Explanation:
 * 6 -> 110 (2 set bits, 2 is prime)
 * 7 -> 111 (3 set bits, 3 is prime)
 * 9 -> 1001 (2 set bits , 2 is prime)
 * 10-> 1010 (2 set bits , 2 is prime)
 *
 */

public class PrimenumberSetBits {
   public static int countPrimeSetBits(int l, int r) {
      Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
      int cnt = 0;
      for (int i = l; i <= r; i++) {
         int bits = 0;
         for (int n = i; n > 0; n >>= 1) {
            bits += n & 1;
         }
         cnt += primes.contains(bits) ? 1 : 0;
      }
      return cnt;
   }

   public static void main(String[] args) {
      System.out.println(String.format("Prime # of set bits between %s and %s is %s", 6, 10, countPrimeSetBits(6, 10)));
   }
}
