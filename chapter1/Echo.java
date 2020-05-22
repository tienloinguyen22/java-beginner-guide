package chapter1;

public class Echo {
  public static void main(String args[]) {
    if (args.length == 0) {
      System.out.println("");
      return;
    }

    System.out.println(args[0]);
  }
}