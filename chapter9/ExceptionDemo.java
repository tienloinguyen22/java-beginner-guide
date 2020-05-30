package chapter9;

class ExceptionDemo {
  public static void main(String[] args) {
    try {
      int[] nums = new int[4];
      System.out.println("Before exception");

      nums[5] = 22;
      System.out.println("This won't be printed");
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("Array index out of bound");
    }

    System.out.println("Finished");
  }
}