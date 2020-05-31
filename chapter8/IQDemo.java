package chapter8;

class FixedQueue implements ICharQ {
  private char[] chars;
  private int putLocation, getLocation;

  FixedQueue(int size) {
    this.chars = new char[size];
    this.putLocation = this.getLocation = 0;
  }

  public void put(char c) {
    if (this.putLocation == this.chars.length) {
      System.out.println("Queue is full");
      return;
    }

    this.chars[this.putLocation] = c;
    this.putLocation += 1;
  }

  public char get() {
    if (this.getLocation == this.putLocation) {
      System.out.println("Queue is empty");
      return (char) 0;
    }

    char c = this.chars[this.getLocation];
    this.getLocation += 1;
    return c;
  }
}

class CircularQueue implements ICharQ {
  private char[] chars;
  private int putLocation, getLocation;

  CircularQueue(int size) {
    this.chars = new char[size + 1];
    this.putLocation = this.getLocation = 0;
  }

  public void put(char c) {
    if (this.putLocation + 1 == this.getLocation || (this.putLocation == this.chars.length - 1) & this.getLocation == 0) {
      System.out.println("Queue is full");
      return;
    }

    this.chars[this.putLocation] = c;
    this.putLocation += 1;

    if (this.putLocation == chars.length) {
      this.putLocation = 0;
    }
  }

  public char get() {
    if (this.getLocation == this.putLocation) {
      System.out.println("Queue is empty");
      return (char) 0;
    }

    char c = this.chars[this.getLocation];
    this.getLocation += 1;
    if (this.getLocation == this.chars.length) {
      this.getLocation = 0;
    }
    return c;
  }
}

class DynamicQueue implements ICharQ {
  private char[] chars;
  private int putLocation, getLocation;

  DynamicQueue(int size) {
    this.chars = new char[size];
    this.putLocation = this.getLocation = 0;
  }

  public void put(char c) {
    if (this.putLocation == this.chars.length) {
      char[] t = new char[this.chars.length * 2];
      for (int i = 0; i < this.chars.length; i += 1) {
        t[i] = this.chars[i];
      }
      this.chars = t;
      this.chars[this.putLocation] = c;
      this.putLocation += 1;
    }

    this.chars[this.putLocation] = c;
    this.putLocation += 1;
  }

  public char get() {
    if (this.getLocation == this.putLocation) {
      System.out.println("Queue is empty");
      return (char) 0;
    }

    char c = this.chars[this.getLocation];
    this.getLocation += 1;
    return c;
  }
}

public class IQDemo {
  public static void main(String[] args) {
    FixedQueue fq = new FixedQueue(10);
    DynamicQueue dq = new DynamicQueue(5);
    CircularQueue cq = new CircularQueue(10);

    ICharQ icq = fq;
    for (int i = 0; i < 10; i += 1) {
      icq.put((char) ('A' + i));
    }
    System.out.println("Content of fixed queue: ");
    for (int i = 0; i < 10; i += 1) {
      char ch = icq.get();
      System.out.print(ch + " ");
    }
    System.out.println();

    icq = dq;
    for (int i = 0; i < 10; i += 1) {
      icq.put((char) ('Z' - i));
    }
    System.out.println("Content of dynamic queue: ");
    for (int i = 0; i < 10; i += 1) {
      char ch = icq.get();
      System.out.print(ch + " ");
    }
    System.out.println();

    icq = cq;
    for (int i = 0; i < 10; i += 1) {
      icq.put((char) ('A' + i));
    }
    System.out.println("Content of circular queue: ");
    for (int i = 0; i < 10; i += 1) {
      char ch = icq.get();
      System.out.print(ch + " ");
    }
    System.out.println();

    // Put more chars to circular queue
    for (int i = 10; i < 20; i += 1) {
      icq.put((char) ('A' + i));
    }
    System.out.println("Content of circular queue: ");
    for (int i = 0; i < 10; i += 1) {
      char ch = icq.get();
      System.out.print(ch + " ");
    }
    System.out.println();

    // Store in and consume from circular queue
    System.out.println("Store and consume from circular queue: ");
    for (int i = 0; i < 20; i += 1) {
      icq.put((char) ('A' + i));
      char ch = icq.get();
      System.out.print(ch + " ");
    }
  }
}