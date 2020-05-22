package chapter1;

class GalToLitTable {
  public static void main(String args[]) {
    for (int i = 1; i <= 100; i += 1) {
      double litters = i * 3.7854;
      System.out.println(i + " gallons is " + litters + " litters");

      if (i % 10 == 0) {
        System.out.println();
      }
    }
  }
}