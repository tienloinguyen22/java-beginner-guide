package chapter6;

class MyStatic {
  int x;
  static int y;

  int sum() {
    return x + y;
  }
}

public class StaticDemo {
  public static void main(String[] args) {
    MyStatic ms1 = new MyStatic();
    MyStatic ms2 = new MyStatic();

    ms1.x = 22;
    ms2.x = 28;
    MyStatic.y = 10;
    System.out.println("ms1.sum: " + ms1.sum());
    System.out.println("ms2.sum: " + ms2.sum());

    MyStatic.y = 20;
    System.out.println("ms1.sum: " + ms1.sum());
    System.out.println("ms2.sum: " + ms2.sum());
  }
}