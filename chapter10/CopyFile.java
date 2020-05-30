package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    int i;
    FileInputStream fileIn;
    FileOutputStream fileOut;

    if (args.length != 2) {
      System.out.println("Usage: ShowFile <sourcefile> <destinationfile>");
      return;
    }

    try {
      fileIn = new FileInputStream(args[0]);
      fileOut = new FileOutputStream(args[1]);
    } catch (FileNotFoundException e) {
      System.out.println("File " + args[0] + " not found");
      return;
    }

    try {
      do {
        i = fileIn.read();
        if (i != -1) {
          fileOut.write(i);
        }
      } while (i != -1);
    } catch (IOException e) {
      System.out.println("Error copying file");
    }

    try {
      fileIn.close();
      fileOut.close();
    } catch (IOException e) {
      System.out.println("Error closing file");
    }
  }
}