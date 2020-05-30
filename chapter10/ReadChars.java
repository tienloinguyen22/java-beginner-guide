package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input characters, \".\" to quit: ");

    try {
      char c;
      do {
        c = (char) bufferedReader.read();
        if (c != '.') {
          System.out.print(c);
        }
      } while (c != '.');
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}