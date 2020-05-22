package chapter3;

public class BreakDemo {
  public static void main(String args[]) {
    int num = 100;
    for (int i = 0; i < 100; i += 1) {
      if (i*i > num) {
        System.out.println("Break");
        break;
      }
      System.out.println("i: " + i);
    }
    System.out.println("Loop complete!");
  }
}