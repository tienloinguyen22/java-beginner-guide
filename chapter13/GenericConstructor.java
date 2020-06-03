package chapter13;

class Summation {
  private int val;

  <T extends Number> Summation(T val) {
    this.val = 0;
    for (int i = 0; i < val.intValue(); i += 1) {
      this.val += i;
    }
  }

  public int getSum() {
    return this.val;
  }
}

public class GenericConstructor {
  public static void main(String[] args) {
    Summation summation = new Summation(4.2);
    System.out.println("Summation: " + summation.getSum());
  }
}