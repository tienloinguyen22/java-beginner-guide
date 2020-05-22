package chapter3;

public class SwitchDemo {
  public static void main(String args[]) {
    for (int i = 0; i < 10; i += 1) {
      switch(i) {
        case 0:
          System.out.println("i is: " + i);
          break;
        case 1:
          System.out.println("i is: " + i);
          break;
        case 2:
          System.out.println("i is: " + i);
          break;
        case 3:
          System.out.println("i is: " + i);
          break;
        case 4:
          System.out.println("i is: " + i);
          break;
        default:
          System.out.println("i is greater than 4 ");
          break;
      }
    }
  }
}