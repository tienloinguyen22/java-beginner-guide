package chapter11;

class SumArray {
  private int sum;

  synchronized int sumArrays(int[] nums) {
    this.sum = 0;
    for (int i = 0; i < nums.length; i += 1) {
      this.sum += nums[i];
      System.out.println("Running total for " + Thread.currentThread().getName() + " is" + this.sum);
      try {
        Thread.sleep(10);
      } catch(InterruptedException e) {
        System.out.println("Thread interrupted");
      }
    }
    return this.sum;
  }
}

class MyThread2 implements Runnable {
  Thread thread;
  int[] nums;
  int answer;
  static SumArray sa = new SumArray();

  MyThread2(String name, int[] nums) {
    this.nums = nums;
    this.thread = new Thread(this, name);
  }

  public static MyThread2 createAndRun(String name, int[] nums) {
    MyThread2 mythread2 = new MyThread2(name, nums);
    mythread2.thread.start();
    return mythread2;
  }

  public void run() {
    System.out.println(this.thread.getName() + " starting");
    this.answer = sa.sumArrays(this.nums);
    System.out.println("Sum for " + this.thread.getName() + " is " + this.answer);
    System.out.println(this.thread.getName() + " terminating");
  }
}

public class Sync {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    MyThread2 mt21 = MyThread2.createAndRun("child #1", nums);
    MyThread2 mt22 = MyThread2.createAndRun("child #2", nums);

    try {
      mt21.thread.join();
      mt22.thread.join();
    } catch(InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
  }
}