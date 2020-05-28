package chapter6;

public class QuickSortRecursive {
  public static void main(String[] args) {
    char[] items = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
    System.out.println("Original array: ");
    for (int i = 0; i < items.length; i += 1) {
      System.out.print(items[i] + " ");
      if (i == items.length - 1) {
        System.out.println();
      }
    }

    QuickSortRecursive.qs(items, 0, items.length - 1);
    System.out.println("Sorted array: ");
    for (int i = 0; i < items.length; i += 1) {
      System.out.print(items[i] + " ");
      if (i == items.length - 1) {
        System.out.println();
      }
    }
  }

  private static void qs(char[] items, int left, int right) {
    int i = left;
    int j = right;
    char x = items[(left + right) / 2];

    do {
      while (items[i] < x && i < right) {
        i += 1;
      }
      while (items[j] > x && j > left) {
        j -= 1;
      }
      if (i <= j) {
        char y = items[j];
        items[j] = items[i];
        items[i] = y;
        i += 1;
        j -= 1;
      }
    } while (i <= j);

    if (left < j) {
      qs(items, left, j);
    }
    if (i < right) {
      qs(items, i, right);
    }
  }
}