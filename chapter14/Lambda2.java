package chapter14;

interface NumericTest {
  boolean test(int x, int y);
}

public class Lambda2 {
  public static void main(String[] args) {
    NumericTest nt1 = (x, y) -> x % y == 0;
    if (nt1.test(10, 2)) {
      System.out.println("2 is a factor of 10");
    }
    if (!nt1.test(10, 3)) {
      System.out.println("3 isnt a factor of 10");
    }

    NumericTest nt2 = (x, y) -> x < y;
    if (nt2.test(2, 10)) {
      System.out.println("10 is greater than 2");
    }
    if (!nt2.test(10, 2)) {
      System.out.println("2 is less than 10");
    }

    NumericTest nt3 = (x, y) -> Math.abs(x) == Math.abs(y);
    if (nt3.test(10, -10)) {
      System.out.println("absolute value of 10 and -10 are equal");
    }
    if (!nt1.test(-22, 10)) {
      System.out.println("absolute value of 10 and -22 arent equal");
    }
  }
}