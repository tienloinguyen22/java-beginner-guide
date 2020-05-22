package chapter2;

// Demonstrate type casting

class CastDemo {
  public static void main(String args[]) {
    double x = 10.0;
    double y = 10.0;
    byte b;
    int i;
    char ch;

    i = (int) (x / y);
    System.out.println("Int outcome of x/y: " + i);

    i = 100;
    b = (byte) i;
    System.out.println("Value of b: " + b);

    i = 257;
    b = (byte) i;
    System.out.println("Value of b: " + b);

    b = 88;
    ch = (char) b;
    System.out.println("Value of ch: " + ch);
  }
}