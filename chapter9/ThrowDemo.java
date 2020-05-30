package chapter9;

public class ThrowDemo {
  public static void main(String[] args) {
    try {
      throw new ArithmeticException();
    } catch (ArithmeticException exception) {
      System.out.println(exception);
    }
  }
}