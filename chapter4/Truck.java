package chapter4;

public class Truck extends Vehicle {
  private int cargoCap;

  Truck(int p, int f, int m, int c) {
    super(p, f, m);
    this.cargoCap = c;
  }

  int getCargoCap() {
    return this.cargoCap;
  }

  void setCargoCap(int c) {
    this.cargoCap = c;
  }
}