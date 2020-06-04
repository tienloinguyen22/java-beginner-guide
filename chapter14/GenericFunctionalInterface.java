package chapter14;

interface SomeTest<T> {
  boolean test(T m, T n);
}

public class GenericFunctionalInterface {
  public static void main(String[] args) {
    SomeTest<Integer> isFactor = (m, n) -> m % n == 0;
    if (isFactor.test(10, 2)) {
      System.out.println("2 is a factor of 10");
    }

    SomeTest<String> isIn = (m, n) -> m.indexOf(n) > -1;
    if (isIn.test("sese22", "se")) {
      System.out.println("found 'se' inside 'sese22'");
    }
  }
}