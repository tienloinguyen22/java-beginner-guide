package chapter3;

public class TwoVariablesFor {
  public static void main(String args[]) {
    for (int i = 0, j = 10; i < j; i += 1, j -= 1) {
      System.out.println("i and j: " + i + " " + j);
    }
  }
}