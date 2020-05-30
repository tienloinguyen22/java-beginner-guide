package chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFileAutoClose {
  public static void main(String[] args) {
    int i;

    if (args.length != 1) {
      System.out.println("Usage: ShowFile <filepath>");
      return;
    }

    try (FileInputStream fileIn = new FileInputStream(args[0]);) {
      do {
        i = fileIn.read();
        if (i != -1) {
          System.out.print((char) i);
        }
      } while (i != -1);
    } catch (IOException e) {
      System.out.println("Error reading file");
    }
  }
}