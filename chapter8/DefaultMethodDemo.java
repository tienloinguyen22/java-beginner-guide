package chapter8;

interface MyIF {
  int getUserId();
  default int getAdminId() {
    return 1;
  };
  static int getUniversalId() {
    return 0;
  }
}

class MyIFImp implements MyIF {
  public int getUserId() {
    return 100;
  }
}

public class DefaultMethodDemo {
  public static void main(String[] args) {
    MyIF myif = new MyIFImp();
    System.out.println("User ID: " + myif.getUserId());
    System.out.println("Administrator ID: " + myif.getAdminId());
  }
}