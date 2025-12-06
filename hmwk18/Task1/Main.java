public class Main {
  public static void main(String[] args) {
    Point2D firstCoord = new Point2D(-5., 1.);
    Point2D secondCoord = new Point2D(3., 4.);

    System.out.println(distance(firstCoord, secondCoord));
    // 8.5
    Point2D example1 = new Point2D(-2, 6);
    Point2D example2 = new Point2D(5, -4);
    System.out.println(distance(example1, example2));
    // 12.2
  }

  private static double distance(Point2D coord1, Point2D coord2) {

    double coord1X = coord1.getCoord()[0];
    double coord1Y = coord1.getCoord()[1];
    double coord2X = coord2.getCoord()[0];
    double coord2Y = coord2.getCoord()[1];

    // double differenceX = Math.abs(coord1X - coord2X);
   // double differenceX = coord1X >= coord2X ? coord1X - coord2X : coord2X - coord1X;
    double differenceX = coord1X - coord2X;
    // double differenceY = Math.abs(coord1Y - coord2Y);
    //double differenceY = coord1Y >= coord2Y ? coord1Y - coord2Y : coord2Y - coord1Y;
    double differenceY = coord1Y - coord2Y;

    double result = ((differenceX * differenceX) + (differenceY * differenceY));

    // this could be drastically simplified with just Math.sqrt()
    return squareRoot(result, 0.00001);
  }

  private static double squareRoot(double input, double tolerance) {
    if (input == 0 || input == 1) {
      return input;
    }

    double x = input;
    double root;

    while (true) {

      root = 0.5 * (x + (input / x));

      // the below is basically Math.abs but I'm doing a challenge
      // to not use inbuilt Math methods
      double withoutMathAbs = root >= x ? root - x : x - root;
      // if (Math.abs(root - x) < tolerance) {
      if (withoutMathAbs < tolerance) {
        break;
      }
      x = root;
    }
    return root;
  }
}
