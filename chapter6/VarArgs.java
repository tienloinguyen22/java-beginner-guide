package chapter6;

public class VarArgs {
  public static void main(String[] args) {
    vaTest(10);
    vaTest(22, 28, 11, 25);
    vaTest();
  }

  static void vaTest(int ...v) {
    System.out.println("Number of args: " + v.length);
    System.out.println("Content: ");
    for (int i = 0; i < v.length; i += 1) {
      System.out.println("args " + i + ": " + v[i] + " ");
    }
  }
}