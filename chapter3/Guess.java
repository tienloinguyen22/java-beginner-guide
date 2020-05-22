package chapter3;

public class Guess {
  public static void main (String args[]) throws java.io.IOException {
    char answer = 'K';

    System.out.println("I'm thinking of a letter between A and Z.");
    System.out.println("Can you guess it?");

    char ch = (char) System.in.read();
    if (ch == answer) {
      System.out.println("**That's right. Congratulation");
    } else {
      System.out.println("Sorry you're wrong!!");
    }
  }
}