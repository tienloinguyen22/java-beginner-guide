package chapter12;

enum Transport {
  CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
  int speed;

  Transport(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  };
}

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println("Airplane speed: " + Transport.AIRPLANE.getSpeed());
    
    System.out.println("All transport speed: ");
    for (Transport t: Transport.values()) {
      System.out.println(t + " speed: " + t.getSpeed());
    }
  }
}