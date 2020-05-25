package chapter6;

class FailSoftArray {
  private int[] values;
  private int errValue;
  public int length;

  public FailSoftArray(int size, int errValue) {
    this.values = new int[size];
    this.errValue = errValue;
    this.length = size;
  }

  public int get(int index) {
    if (this.indexOk(index)) {
      return this.values[index];
    }

    return this.errValue;
  }

  public boolean set(int value, int index) {
    if (this.indexOk(index)) {
      this.values[index] = value;
      return true;
    }

    return false;
  }

  private boolean indexOk(int index) {
    return index >= 0 && index < this.length;
  }
}

public class FailSoft {
  public static void main(String[] args) {
    FailSoftArray fsa = new FailSoftArray(5, -1);

    // show quite failures
    System.out.println("Fail quitely");
    for (int i = 0; i < fsa.length * 2; i += 1) {
      fsa.set(i * 10, i);
    }
    for (int i = 0; i < fsa.length * 2; i += 1) {
      if (fsa.get(i) != -1) {
        System.out.print(i + " ");
      }
    }
    System.out.println();


    // handle failures
    System.out.println("Fail with errors report");
    for (int i = 0; i < fsa.length * 2; i += 1) {
      if (!fsa.set(i * 10, i)) {
        System.out.println("Index " + i + " out of bound");
      }
    }
    for (int i = 0; i < fsa.length * 2; i += 1) {
      if (fsa.get(i) != -1) {
        System.out.print(i + " ");
      } else {
        System.out.println("Index " + i + " out of bound");
      }
    }
    System.out.println();
  }
}