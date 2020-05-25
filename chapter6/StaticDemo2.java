package chapter6;

class StaticBlock {
  static double rootOf2;
  static double rootOf3;

  static {
    System.out.println("Inside static block");
    rootOf2 = Math.sqrt(2);
    rootOf3 = Math.sqrt(3);
  }
  
  StaticBlock(String msg) {
    System.out.println(msg);
  }
}

public class StaticDemo2 {
  public static void main(String[] args) {
    StaticBlock sb = new StaticBlock("Inside constructor");
    System.out.println("Square root of 2 is: " + StaticBlock.rootOf2);
    System.out.println("Square root of 3 is: " + StaticBlock.rootOf3);
  }
}