package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem #728
 *
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 */
public class SelfDividingNumber {
   public static List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> list = new ArrayList<>();
      for (int i = left; i <= right; i++) {
         int j = i;
         for (; j > 0; j /= 10) {
            if ((j % 10 == 0) || (i % (j % 10) != 0)) {
               break;
            }
         }
         if (j == 0)
            list.add(i);
      }
      return list;
   }

   public static void main(String[] args) {
      System.out.println("self dividing numbers from 1 to 25 are " + selfDividingNumbers(1, 25));
   }
}
