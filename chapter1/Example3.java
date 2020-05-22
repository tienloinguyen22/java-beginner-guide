package chapter1;

// Differences between float and int

class Example3 {
  public static void main(String args[]) {
    int v = 10;
    double x = 10.0;

    System.out.println("Original value of v: " + v);
    System.out.println("Original value of x: " + x);

    v = v / 4;
    x = x / 4;

    System.out.println("v after division: " + v);
    System.out.println("x after division: " + x);
  }
}