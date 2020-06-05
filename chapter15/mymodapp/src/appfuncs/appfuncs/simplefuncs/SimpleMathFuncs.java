package chapter15.mymodapp.src.appfuncs.appfuncs.simplefuncs;

public class SimpleMathFuncs {
  public static boolean isFactor(int a, int b) {
    return b % a == 0;
  }

  public static int smallestCommonFactor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int min = a < b ? a : b;

    for (int i = 2; i < min / 2; i += 1) {
      if (SimpleMathFuncs.isFactor(i, a) && SimpleMathFuncs.isFactor(i, b)) {
        return i;
      }
    }

    return 1;
  }

  public static int largestCommonFactor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int min = a < b ? a : b;

    for (int i = min / 2; i >= 2; i -= 1) {
      if (SimpleMathFuncs.isFactor(i, a) && SimpleMathFuncs.isFactor(i, b)) {
        return i;
      }
    }

    return 1;
  }
}