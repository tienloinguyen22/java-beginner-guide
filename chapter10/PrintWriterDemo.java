package chapter10;

import java.io.PrintWriter;

public class PrintWriterDemo {
  public static void main(String[] args) {
    PrintWriter printWriter = new PrintWriter(System.out, true);
    printWriter.println("Writing use PrintWriter");
  }
}