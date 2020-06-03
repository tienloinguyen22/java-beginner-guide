package chapter13;

class Gen<T> {
  T ob;

  Gen(T ob) {
    this.ob = ob;
  }

  public T getObject() {
    return this.ob;
  }

  public void showType() {
    System.out.println("Type of object is: " + this.ob.getClass().getName());
  }
}

public class GenericDemo {
  public static void main(String[] args) {
    Gen<Integer> iob = new Gen<Integer>(10);
    iob.showType();
    System.out.println("Value of iob: " + iob.getObject());

    Gen<String> sob = new Gen<String>("Hello generic");
    sob.showType();
    System.out.println("Value of sob: " + sob.getObject());
  }
}