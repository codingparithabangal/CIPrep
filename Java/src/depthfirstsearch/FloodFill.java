package depthfirstsearch;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem #733
 * 
 * An image is represented by a 2-D array of integers, each integer representing
 * the pixel value of the image (from 0 to 65535). Given a coordinate (sr, sc)
 * representing the starting pixel (row and column) of the flood fill, and a
 * pixel value newColor, "flood fill" the image. To perform a "flood fill",
 * consider the starting pixel, plus any pixels connected 4-directionally to the
 * starting pixel of the same color as the starting pixel, plus any pixels
 * connected 4-directionally to those pixels (also with the same color as the
 * starting pixel), and so on. Replace the color of all of the aforementioned
 * pixels with the newColor. At the end, return the modified image.
 *
 */
public class FloodFill {
   public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      int color = image[sr][sc];
      Set<Integer> visited = new HashSet<Integer>();
      if (color != newColor) {
         fill(color, newColor, sr, sc, image, visited);
      }
      return image;
   }

   public static void fill(int old, int newColor, int r, int c, int[][] img, Set<Integer> visited) {
      if (visited.contains(r * img[0].length + c) || r < 0 || r >= img.length || c < 0 || c >= img[0].length
            || img[r][c] != old) {
         return;
      }
      img[r][c] = newColor;
      visited.add(r * img[0].length + c);
      fill(old, newColor, r + 1, c, img, visited);
      fill(old, newColor, r - 1, c, img, visited);
      fill(old, newColor, r, c + 1, img, visited);
      fill(old, newColor, r, c - 1, img, visited);
   }

}
