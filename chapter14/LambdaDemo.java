package chapter14;

interface MyValue {
  double getValue();
}

interface MyParamValue {
  double getValue(double n);
}

class LambdaDemo {
  public static void main(String[] args) {
    MyValue myvalue = () -> 22.28;
    System.out.println("A constant value: " + myvalue.getValue());

    MyParamValue myparamsvalue = (n) -> 1.0 / n;
    System.out.println("A reciprocal of 4.0: " + myparamsvalue.getValue(4.0));
  }
}