package chapter3;

public class KeyboardIn {
  public static void main(String args[]) throws java.io.IOException {
    System.out.println("Press a key followed by ENTER: ");
    char ch = (char) System.in.read();
    System.out.println("Your key is: " + ch);
  }
}