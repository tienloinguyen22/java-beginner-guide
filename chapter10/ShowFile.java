package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
  public static void main(String[] args) {
    int i;
    FileInputStream fileIn;

    if (args.length != 1) {
      System.out.println("Usage: ShowFile <filepath>");
      return;
    }

    try {
      fileIn = new FileInputStream(args[0]);
    } catch (FileNotFoundException e) {
      System.out.println("File " + args[0] + " not found");
      return;
    }

    try {
      do {
        i = fileIn.read();
        if (i != -1) {
          System.out.print((char) i);
        }
      } while (i != -1);
    } catch (IOException e) {
      System.out.println("Error reading file");
    }

    try {
      fileIn.close();
    } catch (IOException e) {
      System.out.println("Error closing file");
    }
  }
}