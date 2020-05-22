package chapter3;

public class BreakLabel {
  public static void main(String args[]) {
    for (int i = 1; i < 4; i += 1) {
      one: {
        two: {
          three: {
            System.out.println("i is: " + i);
            if (i == 1) {
              break one;
            }
            if (i == 2) {
              break two;
            }
            if (i == 3) {
              break three;
            }
          }
          System.out.println("After block 3");
        }
        System.out.println("After block 2");
      }
      System.out.println("After block 1");
    }
  }
}