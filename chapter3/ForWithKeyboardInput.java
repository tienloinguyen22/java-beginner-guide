package chapter3;

public class ForWithKeyboardInput {
  public static void main(String args[]) throws java.io.IOException {
    System.out.println("Press \"S\" to stop. Press any other character to continue: ");
    for (int i = 0; (char) System.in.read() != 'S'; i += 1) {
      System.out.println("Pass #: " + i);
    }
  }
}