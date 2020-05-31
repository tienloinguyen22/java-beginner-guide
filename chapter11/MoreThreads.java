package chapter11;

public class MoreThreads {
  public static void main(String[] args) {
    System.out.println("Starting: main");

    // Create MyThread
    MyThread th1 = MyThread.createAndRun("child #1");
    MyThread th2 = MyThread.createAndRun("child #2");
    MyThread th3 = MyThread.createAndRun("child #3");

    // Run sth concurrently with "newThread" in main thread
    // for (int i = 0; i < 50 ; i += 1) {
    //   try {
    //     System.out.print(".");
    //     Thread.sleep(100);
    //   } catch (InterruptedException e) {
    //     System.out.println("Interrupted: main");
    //   }
    // }
    do {
      try {
        System.out.print(".");
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Interrupted: main");
      }
    } while (th1.thread.isAlive() || th2.thread.isAlive() || th3.thread.isAlive());
    System.out.println("Finished: main");
  }
}