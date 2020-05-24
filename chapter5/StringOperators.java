package chapter5;

public class StringOperators {
  public static void main(String[] args) {
    String string1 = "When it comes to web programming, Java is number 1";
    String string2 = new String(string1);
    String string3 = "Java string is powerful";

    System.out.println("Length of string1: " + string1.length());
    for (int i = 0; i < string1.length(); i += 1) {
      System.out.print(string1.charAt((i)));
    }
    System.out.println();

    if (string1.equals(string2)) {
      System.out.println("string1 equals string2");
    } else {
      System.out.println("string1 not equals string2");
    }

    if (string1.equals(string3)) {
      System.out.println("string1 equals string3");
    } else {
      System.out.println("string1 not equals string3");
    }

    int result = string1.compareTo(string3);
    if (result == 0) {
      System.out.println("string1 equals string3");
    } else if (result < 0) {
      System.out.println("string1 less than string3");
    } else if (result > 0) {
      System.out.println("string1 greater than string3");
    }

    string2 = "One Two Three One";
    int position = string2.indexOf("One");
    int lastPosition = string2.lastIndexOf("One");
    System.out.println("Index of first occurence of \"One\": " + position);
    System.out.println("Index of last occurence of \"One\": " + lastPosition);
  }
}