package chapter14;

interface IntPredicate {
  boolean test(int n);
}

class MyIntPredicate {
  static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i <= n / 2; i += 1) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  static boolean isEven(int n) {
    return n % 2 == 0;
  }

  static boolean isPositive(int n) {
    return n > 0;
  }
}

public class MethodRef {
  static boolean numTest(IntPredicate it, int n) {
    return it.test(n);
  }

  public static void main(String[] args) {
    boolean isPrime = MethodRef.numTest(MyIntPredicate::isPrime, 17);
    if (isPrime) {
      System.out.println("17 is a prime number");
    }

    boolean isEven = MethodRef.numTest(MyIntPredicate::isEven, 22);
    if (isEven) {
      System.out.println("22 is an even number");
    }

    boolean isPositive = MethodRef.numTest(MyIntPredicate::isPositive, 22);
    if (isPositive) {
      System.out.println("22 is a positive number");
    }
  }
}