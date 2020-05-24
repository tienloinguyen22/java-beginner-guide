package chapter5;

public class BubbleSort {
  public static void main(String[] args) {
    int[] nums = {10, -2, 100, -20, 399, 10909, -9876, 123, 0, 1, 9999, -976667};
    System.out.print("Unsorted array: ");
    for (int i = 0; i < nums.length; i += 1) {
      System.out.print(nums[i] + " ");
    }

    for (int i = 0; i < nums.length - 1; i += 1) {
      for (int j = 0; j < nums.length - i - 1; j += 1) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
        }
      }
    }

    System.out.println();
    System.out.print("Sorted array: ");
    for (int i = 0; i < nums.length; i += 1) {
      System.out.print(nums[i] + " ");
    }
  }
}