package chapter1;

// Demonstrate If statement

class IfDemo {
  public static void main(String args[]) {
    int a = 2;
    int b = 3;
    int c = a - b;
    int d = b - a;

    if (a < b) {
      System.out.println("a is less than b");
    }

    if (a == b) {
      System.out.println("You won't see this");
    }

    if (c >= 0) {
      System.out.println("c is non-negative");
    } else {
      System.out.println("c is negative");
    }

    if (d >= 0) {
      System.out.println("d is non-negative");
    } else {
      System.out.println("d is negative");
    }
  }
}