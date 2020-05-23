package chapter4;

public class TwoVehicle {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(9, 12, 21);
    minivan.range();

    Vehicle sportcar = new Vehicle(2, 14, 12);
    sportcar.range();
  }
}