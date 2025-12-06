public class Point2D {
  private double x;
  private double y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }
  ;

  public static Point2D randomPoint2D() {
    double randomX = (double) (Math.random() * 101. - 50.);
    double randomY = (double) (Math.random() * 101. - 50.);

    return new Point2D(randomX, randomY);
  }

  public double[] getCoord(){
    double[] result = new double[]{this.x, this.y};
    return result;
  } 

  // setter that I need for scaleAllPoints
  public void setCoords(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point2D coord1, Point2D coord2) {

    double coord1X = coord1.getCoord()[0];
    double coord1Y = coord1.getCoord()[1];
    double coord2X = coord2.getCoord()[0];
    double coord2Y = coord2.getCoord()[1];

    double differenceX = coord1X - coord2X;
    double differenceY = coord1Y - coord2Y;

    double result = ((differenceX * differenceX) + (differenceY * differenceY));
    return squareRoot(result, 0.00001);
  }

    // Litterally just using Math.sqrt is simpler, for whatever reason, I wanted to not use it.
  private static double squareRoot(double input, double tolerance) {
    if (input == 0 || input == 1) {
      return input;
    }

    double x = input;
    double root;

    while (true) {
      root = 0.5 * (x + (input / x));

      double withoutMathAbs = root >= x ? root - x : x - root;
      if (withoutMathAbs < tolerance) {
        break;
      }
      x = root;
    }
    return root;
  }
}
