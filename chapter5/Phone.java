package chapter5;

public class Phone {
  public static void main(String[] args) {
    String[][] contacts = {
      {"Tom", "555-3322"},
      {"Mary", "555-8976"},
      {"John", "555-1037"},
      {"Rachel", "555-1400"},
    };

    if (args.length != 1) {
      System.out.println("Usage: java Phone <contact name>");
    } else {
      boolean found = false;
      for (String[] contact: contacts) {
        if (contact[0].equals(args[0])) {
          found = true;
          System.out.println(contact[0] + ": " + contact[1]);
        }
      }

      if (!found) {
        System.out.println("Contact \"" + args[0] + "\" not found");
      }
    }
  }
}