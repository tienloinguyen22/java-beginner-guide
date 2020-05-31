package chapter11;

public class JoinThreads {
  public static void main(String[] args) {
    System.out.println("Starting: main");

    // Create MyThread
    MyThread th1 = MyThread.createAndRun("child #1");
    MyThread th2 = MyThread.createAndRun("child #2");
    MyThread th3 = MyThread.createAndRun("child #3");

    // Run sth concurrently with "newThread" in main thread
    try {
      th1.thread.join();
      System.out.println("Thread #1 joined");
      th2.thread.join();
      System.out.println("Thread #2 joined");
      th3.thread.join();
      System.out.println("Thread #3 joined");
    } catch (InterruptedException e) {
      System.out.println("Interrupted: main");
    }
    System.out.println("Finished: main");
  }
}