package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAutoClose {
  public static void main(String[] args) {
    int i;

    if (args.length != 2) {
      System.out.println("Usage: ShowFile <sourcefile> <destinationfile>");
      return;
    }

    try (
      FileInputStream fileIn = new FileInputStream(args[0]);
      FileOutputStream fileOut = new FileOutputStream(args[1], true);
    ) {
      do {
        i = fileIn.read();
        if (i != -1) {
          fileOut.write(i);
        }
      } while (i != -1);
    } catch (IOException e) {
      System.out.println("Error copying file");
    }
  }
}