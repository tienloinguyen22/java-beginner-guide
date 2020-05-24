package chapter5;

class MinMax {
  public static void main(String args[]) {
    int nums[] = {99, -10, 1000, 1235, -982, 2323, 100009, -22223, 0, 1, 888888};
    int min = nums[0];
    int max = nums[0];

    for (int x: nums) {
      if (x < min) {
        min = x;
      }

      if (x > max) {
        max = x;
      }
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}