package chapter15.mymodapp.src.appstart.appstart.mymodappdemo;

import chapter15.mymodapp.src.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
  public static void main(String[] args) {
    if (SimpleMathFuncs.isFactor(2, 10)) {
      System.out.println("2 is a factor of 10");
    }

    System.out.println("Smallest factor common to 35 and 105 is: " + SimpleMathFuncs.smallestCommonFactor(35, 105));
    System.out.println("Largest factor common to 35 and 105 is: " + SimpleMathFuncs.smallestCommonFactor(35, 105));
  }
}