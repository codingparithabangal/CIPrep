package dynamicprogramming;

/**
 * 
 * Problem #746
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 * Once you pay the cost, you can either climb one or two steps. 
 * You need to find minimum cost to reach the top of the floor, 
 * and you can either start from the step with index 0, or the step with index 1.
 * Example 1:
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 * Example 2:
 * Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 *
 */

public class MinCostClimbingStairs {
   public static int minCostClimbingStairs(int[] cost) {
      int m1 = cost[0];
      int m2 = cost[1];
      int currentMin = Math.min(m1, m2);
      for (int i = 2; i < cost.length; i++) {
         currentMin = Math.min(m1 + cost[i], m2 + cost[i]);
         m1 = m2;
         m2 = currentMin;
      }
      return Math.min(m1, m2);
   }

   public static void main(String[] args) {
      int []stairs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
      System.out.println("Mininum cost to climb stairs is "+minCostClimbingStairs(stairs));
   }
}
