package chapter8;

interface Series {
  int getNext();
  void reset();
  void setStart(int x);
  default int[] getNextArray(int n) {
    int[] nextArray = new int[n];
    for (int i = 0; i < n; i += 1) {
      nextArray[i] = this.getNext();
    }
    return nextArray;
  };
}

class ByTwos implements Series {
  int start;
  int val;

  ByTwos(int start) {
    this.start = start;
    this.val = start;
  }

  public int getNext() {
    this.val += 2;
    return this.val;
  };

  public void reset() {
    this.val = this.start;
  }

  public void setStart(int x) {
    this.start = x;
    this.val = x;
  }
}

class SeriesDemo {
  public static void main(String[] args) {
    ByTwos bt = new ByTwos(0);

    for (int i = 0; i < 5; i += 1) {
      System.out.println("Next value is: " + bt.getNext());
    }

    System.out.println("Resetting value to 0");
    bt.reset();
    System.out.println("Next value is: " + bt.getNext());

    System.out.println("Starting at 100");
    bt.setStart(100);
    System.out.println("Next value is: " + bt.getNext());
  }
}