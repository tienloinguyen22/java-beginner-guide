package chapter6;

class MyClass {
  private int alpha;
  public int beta;
  int gamma;

  void setAlpha(int a) {
    this.alpha = a;
  }

  int getAlpha() {
    return this.alpha;
  }
}

public class AccessDemo {
  public static void main(String[] args) {
    MyClass mc = new MyClass();

    mc.setAlpha(2228);
    System.out.println("mc.alpha is: " + mc.getAlpha());

    mc.beta = 22;
    mc.gamma = 28;
    System.out.println("mc.beta is: " + mc.beta);
    System.out.println("mc.gamma is: " + mc.gamma);
  }
}