package chapter6;

class MyOverloadClass {
  int x;

  MyOverloadClass() {
    System.out.println("Initialize without any parameter");
    this.x = 0;
  }

  MyOverloadClass(int x) {
    System.out.println("Initialize with one int parameter");
    this.x = x;
  }

  MyOverloadClass(double x) {
    System.out.println("Initialize with one double parameter");
    this.x = (int) x;
  }

  MyOverloadClass(int i, int j) {
    System.out.println("Initialize with two int parameters");
    this.x = i * j;
  }
}

public class OverloadDemo {
  public static void main(String[] args) {
    MyOverloadClass oc1 = new MyOverloadClass();
    MyOverloadClass oc2 = new MyOverloadClass(11);
    MyOverloadClass oc3 = new MyOverloadClass(22.28);
    MyOverloadClass oc4 = new MyOverloadClass(22, 28);

    System.out.println("oc1.x: " + oc1.x);
    System.out.println("oc2.x: " + oc2.x);
    System.out.println("oc3.x: " + oc3.x);
    System.out.println("oc4.x: " + oc4.x);
  }
}