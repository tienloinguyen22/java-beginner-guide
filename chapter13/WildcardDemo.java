package chapter13;

class NumericFns<T extends Number> {
  T ob;

  NumericFns(T ob) {
    this.ob = ob;
  }

  boolean isAbsEqual(NumericFns<?> nf) {
    if (Math.abs(this.ob.doubleValue()) == Math.abs(nf.ob.doubleValue())) {
      return true;
    }
    return false;
  }
}

public class WildcardDemo {
  public static void main(String args[]) {
    NumericFns<Integer> iob = new NumericFns<Integer>(6);
    NumericFns<Double> dob = new NumericFns<Double>(-6.0);
    System.out.println("Result: " + iob.isAbsEqual(dob));
  }
}