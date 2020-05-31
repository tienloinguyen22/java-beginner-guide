package chapter11;

class TickTock {
  String state;

  synchronized void tick(boolean running) {
    if (!running) {
      this.state = "ticked";
      notify();
      return;
    }

    System.out.print("Tick ");
    this.state = "ticked";
    notify();

    try {
      while (!this.state.equals("tocked")) {
        wait();
      }
    } catch(InterruptedException e) {
      System.out.println("Thread interrupted");
    }
  }

  synchronized void tock(boolean running) {
    if (!running) {
      this.state = "tocked";
      notify();
      return;
    }

    System.out.println("Tock ");
    this.state = "tocked";
    notify();

    try {
      while (!this.state.equals("ticked")) {
        wait();
      }
    } catch(InterruptedException e) {
      System.out.println("Thread interrupted");
    }
  }
}

class MyThread3 implements Runnable {
  Thread thread;
  TickTock ticktock;

  MyThread3(String name, TickTock ticktock) {
    this.thread = new Thread(this, name);
    this.ticktock = ticktock;
  }

  public static MyThread3 createAndRun(String name, TickTock ticktock) {
    MyThread3 mt3 = new MyThread3(name, ticktock);
    mt3.thread.start();
    return mt3;
  }

  public void run() {
    if (this.thread.getName().compareTo("Tick") == 0) {
      for (int i = 0; i < 5; i += 1) {
        this.ticktock.tick(true);
      }
      this.ticktock.tick(false);
    } else {
      for (int i = 0; i < 5; i += 1) {
        this.ticktock.tock(true);
      }
      this.ticktock.tock(false);
    }
  }
}

public class ThreadsCommunication {
  public static void main(String[] args) {
    TickTock ticktock = new TickTock();
    MyThread3 tick = MyThread3.createAndRun("Tick", ticktock);
    MyThread3 tock = MyThread3.createAndRun("Tock", ticktock);

    try {
      tick.thread.join();
      tock.thread.join();
    } catch(InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
  }
}