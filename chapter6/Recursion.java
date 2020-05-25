package chapter6;

class Factorial {
  public int factorialRecursion(int n) {
    if (n == 1) {
      return 1;
    }
    int result = this.factorialRecursion(n - 1) * n;
    return result;
  }

  public int factorialIterative(int n) {
    int result = 1;
    for (int i = 1; i <= n; i += 1) {
      result *= i;
    }
    return result;
  }
}

public class Recursion {
  public static void main(String args[]) {
    Factorial f = new Factorial();
    System.out.println("Factorial by recursion: " + f.factorialRecursion(6));
    System.out.println("Factorial by iteration: " + f.factorialIterative(6));
  }
}