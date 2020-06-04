package chapter14;

interface StringFunc {
  String func(String s);
}

public class LamdaArg {
  static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String[] args) {
    String inStr = "Lambda expression expand Java";
    StringFunc reverse = (s) -> {
      String result = "";
      for (int i = s.length() - 1; i >= 0; i -= 1) {
        result += s.charAt(i);
      }

      return result;
    };

    String outStr = LamdaArg.changeStr(reverse, inStr);
    System.out.println("Reverse string: " + outStr);
  }
}