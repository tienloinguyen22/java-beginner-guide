package chapter8.bookpackext;

import chapter8.bookpack.*;

public class UseBook {
  public static void main(String[] args) {
    Book book = new chapter8.bookpack.Book(
      "Java: A beginner's guide",
      "Schildt",
      2019
    );

    book.show();
  }
}