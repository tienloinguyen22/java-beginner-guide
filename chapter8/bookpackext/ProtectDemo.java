package chapter8.bookpackext;

class ExtBook extends chapter8.bookpack.Book {
  String publisher;

  public ExtBook(String title, String author, int publishDate, String publisher) {
    super(title, author, publishDate);
    this.publisher = publisher;
  }

  public void show() {
    super.show();
    System.out.println("Publisher: " + this.publisher);
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPublishDate() {
    return this.publishDate;
  }

  public void setPublishDate(int publishDate) {
    this.publishDate = publishDate;
  }
}

public class ProtectDemo {
  public static void main(String[] args) {
    ExtBook[] extBooks = new ExtBook[5];

    extBooks[0] = new ExtBook(
      "Java: A beginner's guide",
      "Schildt",
      2019,
      "Oracle Press"
    );
    extBooks[1] = new ExtBook(
      "Java: The complete referece",
      "Schildt",
      2019,
      "Oracle Press"
    );
    extBooks[2] = new ExtBook(
      "Introducing JavaFX 8 programming",
      "Schildt",
      2015,
      "Oracle Press"
    );
    extBooks[3] = new ExtBook(
      "Red storm rising",
      "Clancy",
      1986,
      "Putname"
    );
    extBooks[4] = new ExtBook(
      "On the road",
      "Kerouac",
      1955,
      "Viking"
    );

    for (int i = 0; i < extBooks.length; i += 1) {
      extBooks[i].show();
    }

    System.out.println("All books by Schildt: ");
    for (int i = 0; i < extBooks.length; i += 1) {
      if (extBooks[i].getAuthor() == "Schildt") {
        System.out.println(extBooks[i].getTitle());
      }
    }
  }
}