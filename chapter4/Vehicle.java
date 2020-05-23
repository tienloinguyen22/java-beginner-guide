package chapter4;

class Vehicle {
  int passengers;
  int fuelCap;
  int milesPerGallon;

  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelCap = f;
    milesPerGallon = m;
  }

  void range() {
    int vehicleRange = fuelCap * milesPerGallon;
    System.out.println("Minivan can carry " + passengers + " passengers for a maximun range of " + vehicleRange + " miles");
  }

  double fuelNeeded(int range) {
    return (double) range / milesPerGallon;
  }
}