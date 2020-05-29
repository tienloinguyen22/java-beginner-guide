package chapter8.bookpack;

public class Book {
  protected String title;
  protected String author;
  protected int publishDate;

  public Book(String title, String author, int publishDate) {
    this.title = title;
    this.author = author;
    this.publishDate = publishDate;
  }

  public void show() {
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Publish Date: " + this.publishDate);
  }
}