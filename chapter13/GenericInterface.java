package chapter13;

interface Containment<T> {
  boolean contains(T ob);
}

class MyClass<T> implements Containment<T> {
  T[] arrayRef;

  MyClass(T[] arrayRef) {
    this.arrayRef = arrayRef;
  }

  public boolean contains(T item) {
    for (T arrayItem: this.arrayRef) {
      if (arrayItem.equals(item)) {
        return true;
      }
    }
    return false;
  }
}

public class GenericInterface {
  public static void main(String[] args) {
    Integer[] vals = {1, 2, 3, 4, 5};
    MyClass<Integer> myclass = new MyClass<Integer>(vals);

    if (myclass.contains(2)) {
      System.out.println("vals contains 2");
    } else {
      System.out.println("vals doesn't contains 2");
    }
    if (myclass.contains(8)) {
      System.out.println("vals contains 8");
    } else {
      System.out.println("vals doesn't contains 8");
    }
    if (myclass.contains(3)) {
      System.out.println("vals contains 3");
    } else {
      System.out.println("vals doesn't contains 3");
    }
  }
}