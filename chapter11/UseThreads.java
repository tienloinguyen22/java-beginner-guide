package chapter11;

class MyThread implements Runnable {
  Thread thread;

  MyThread(String threadName) {
    this.thread = new Thread(this, threadName);
  }

  public static MyThread createAndRun(String name) {
    MyThread mythread = new MyThread(name);
    mythread.thread.start();
    return mythread;
  }

  public void run() {
    System.out.println("Starting: " + this.thread.getName());
    try {
      for (int i = 0; i < 10; i += 1) {
        Thread.sleep(400);
        System.out.println(this.thread.getName() + ": " + i);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted: " + this.thread.getName());
    }
    System.out.println("Finished: " + this.thread.getName());
  }
}

public class UseThreads {
  public static void main(String[] args) {
    System.out.println("Starting: main");

    // Create MyThread
    MyThread.createAndRun("child #1");

    // Run sth concurrently with "newThread" in main thread
    for (int i = 0; i < 50 ; i += 1) {
      try {
        System.out.print(".");
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Interrupted: main");
      }
    }
    System.out.println("Finished: main");
  }
}