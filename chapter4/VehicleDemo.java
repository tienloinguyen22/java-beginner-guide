package chapter4;

class VehicleDemo {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(9, 12, 21);

    int range = minivan.fuelCap * minivan.milesPerGallon;
    System.out.println("Minivan can carry " + minivan.passengers + " passengers for a maximun range of " + range + " miles");
  }
}