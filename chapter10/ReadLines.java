package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input lines of text. Enter \"stop\" to quit");

    try {
      String line;
      do {
        line = bufferedReader.readLine();
        if (!line.equals("stop")) {
          System.out.println(line);
        }
      } while (!line.equals("stop"));
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}