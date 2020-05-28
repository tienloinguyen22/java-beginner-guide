package chapter7;

class TwoDShape {
  double width;
  double height;
  private String name;

  TwoDShape() {
    this.width = this.height = 0.0;
    this.name = "none";
  }

  TwoDShape(double x, String name) {
    this.width = this.height = x;
    this.name = name;
  }

  TwoDShape(double width, double height, String name) {
    this.width = width;
    this.height = height;
    this.name = name;
  }

  TwoDShape(TwoDShape ob) {
    this.width = ob.width;
    this.height = ob.height;
    this.name = ob.name;
  }

  double getWidth() {
    return this.width;
  }

  void setWidth(double width) {
    this.width = width;
  }

  double getHeight() {
    return this.height;
  }

  void setHeight(double height) {
    this.height = height;
  }

  String getName() {
    return this.name;
  }

  void showDimension() {
    System.out.println("Width: " + this.width);
    System.out.println("Height: " + this.height);
  }

  double area() {
    System.out.println("area() must be overriden");
    return 0.0;
  }
}

class Triangle extends TwoDShape {
  private String style;

  Triangle() {
    super();
    this.style = "none";
  }

  Triangle(String style, double width, double height) {
    super(width, height, "Triangle");
    this.style = style;
  }

  Triangle(double x) {
    super(x, "Triangle");
    this.style = "filled";
  }

  Triangle(Triangle obj) {
    super(obj);
    this.style = obj.style;
  }

  double area() {
    return this.getWidth() * this.getHeight();
  }

  void showStyle() {
    System.out.println("Triangle is: " + this.style);
  }
}

class Rectangle extends TwoDShape {
  Rectangle() {
    super();
  }

  Rectangle(double width, double height) {
    super(width, height, "Rectangle");
  }

  Rectangle(double x) {
    super(x, "Rectangle");
  }

  Rectangle(Rectangle obj) {
    super(obj);
  }

  boolean isSquare() {
    return this.width == this.height;
  }

  double area() {
    return this.getWidth() * this.getHeight();
  }
}

class Shapes {
  public static void main(String[] args) {
    TwoDShape[] shapes = new TwoDShape[5];
    shapes[0] = new Triangle("Outlined", 8.0, 12.0);
    shapes[1] = new Rectangle(10.0);
    shapes[2] = new Rectangle(10.0, 4.0);
    shapes[3] = new Triangle(7.0);
    shapes[4] = new TwoDShape(10, 20, "Generic");

    for (int i = 0; i < shapes.length; i += 1) {
      System.out.println("Object is " + shapes[i].getName());
      System.out.println("Area is " + shapes[i].area());
      System.out.println();
    }
  }
}