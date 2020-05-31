package chapter11;

class MyThread4 implements Runnable {
  Thread thread;
  boolean suspend;
  boolean stop;

  MyThread4(String name) {
    this.thread = new Thread(this, name);
    this.suspend = false;
    this.stop = false;
  }

  public static MyThread4 createAndRun(String name) {
    MyThread4 mt4 = new MyThread4(name);
    mt4.thread.start();
    return mt4;
  }

  public void run() {
    System.out.println(this.thread.getName() + " starting");
    try {
      for (int i = 1; i < 1000; i += 1) {
        System.out.print(i + " ");
        if (i % 10 == 0) {
          System.out.println();
          Thread.sleep(250);
        }

        synchronized(this) {
          while (this.suspend) {
            wait();
          }
          if (this.stop) {
            break;
          }
        }
      }
    } catch(InterruptedException e) {
      System.out.println(this.thread.getName() + " interrupted");
    }
    System.out.println(this.thread.getName() + " exiting");
  }

  synchronized void mystop() {
    this.stop = true;
    this.suspend = false;
    notify();
  }

  synchronized void mysuspend() {
    this.suspend = true;
  }

  synchronized void myresume() {
    this.suspend = false;
    notify();
  }
}

public class Suspend {
  public static void main(String[] args) {
    MyThread4 mt4 = MyThread4.createAndRun("child #1");

    try {
      Thread.sleep(1000);

      mt4.mysuspend();
      System.out.println("Suspending thread");
      Thread.sleep(1000);

      mt4.myresume();
      System.out.println("Resuming thread");
      Thread.sleep(1000);

      mt4.mysuspend();
      System.out.println("Suspending thread");
      Thread.sleep(1000);

      mt4.myresume();
      System.out.println("Resuming thread");
      Thread.sleep(1000);

      mt4.mysuspend();
      System.out.println("Suspending thread");
      mt4.mystop();
    } catch(InterruptedException e) {
      System.out.println("Main thread interrupted");
    }

    try {
      mt4.thread.join();
    } catch(InterruptedException e) {
      System.out.println("Main thread interrupted");
    }

    System.out.println("Main thread exiting");
  }
}