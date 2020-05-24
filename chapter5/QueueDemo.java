package chapter5;

class Queue {
  char[] queue;
  int putLocation, getLocation;

  Queue(int size) {
    this.queue = new char[size];
    this.putLocation = 0;
    this.getLocation = 0;
  }

  void put(char c) {
    if (this.putLocation == this.queue.length) {
      System.out.println("Queue is full");
    } else {
      this.queue[this.putLocation] = c;
      this.putLocation += 1;
    }
  }

  char get() {
    if (this.getLocation == this.putLocation) {
      System.out.println("Queue is empty");
      return (char) 0;
    } else {
      char result = this.queue[this.getLocation];
      this.getLocation += 1;
      return result;
    }
  }
}

public class QueueDemo {
  public static void main(String[] args) {
    Queue bigQueue = new Queue(100);
    Queue smallQueue = new Queue(4);

    System.out.println("Using bigQueue to store alphabet");
    for (int i = 0; i < 26; i += 1) {
      bigQueue.put((char) ('A' + i));
    }
    
    System.out.println("Content of bigQueue: ");
    for (int i = 0; i < 26; i += 1) {
      char ch = bigQueue.get();
      if (ch != (char) 0) {
        System.out.print(ch);
      }
    }
    System.out.println();

    System.out.println("Using smallQueue to generate errors");
    for (int i = 0; i < 5; i += 1) {
      System.out.println("Attempting to store: " + (char) ('Z' - i));
      smallQueue.put((char) ('Z' - i));
    }

    System.out.println("Content of smallQueue: ");
    for (int i = 0; i < 5; i += 1) {
      char ch = smallQueue.get();
      if (ch != (char) 0) {
        System.out.print(ch);
      }
    }
    System.out.println();
  }
}