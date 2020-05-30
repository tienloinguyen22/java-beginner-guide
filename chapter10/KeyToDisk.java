package chapter10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToDisk {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input data. Enter \"stop\" to quit");

    try (FileWriter fw = new FileWriter("/Users/nguyentienloi/Desktop/java-beginner-guide/chapter10/files/key-to-disk.txt")) {
      String str;
      do {
        str = bufferedReader.readLine();
        if (!str.equals("stop")) {
          str += "\n";
          fw.write(str);
        }
      } while (!str.equals("stop"));
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}