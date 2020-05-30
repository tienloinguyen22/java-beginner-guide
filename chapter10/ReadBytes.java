package chapter10;

import java.io.IOException;

public class ReadBytes {
  public static void main(String[] args) throws IOException {
    byte[] data = new byte[10];
    System.out.println("Input data: ");
    System.in.read(data);

    System.out.println("Your input: ");
    for (int i = 0; i < data.length; i += 1) {
      System.out.print((char) data[i]);
    }
  }
}