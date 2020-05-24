package chapter5;

public class Search {
  public static void main(String[] args) {
    int[] nums = {6, 7, -1, 8, 5, -10, -12, 3};
    int val = 5;
    boolean found = false;

    for (int i: nums) {
      if (i == val) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Found val in nums");
    } else {
      System.out.println("Couldn't find val in nums");
    }
  }
}